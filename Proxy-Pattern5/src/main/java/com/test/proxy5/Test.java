package com.test.proxy5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Moveable> infce = Moveable.class;
		System.out.println(infce.getName());
		String src = "package com.test.proxy5;\n" +
				"\n" +
				"public class TankProxy implements " + infce.getName() + "{\n" +
				"\tMoveable tank;\n" +
				"\t\n" +
				"\tpublic TankProxy(" + infce.getName() + " moveable) {\n" +
				"\t\tthis.tank = moveable;\n" +
				"\t}\n" +
				"\t\n" +
				"\t@Override\n" +
				"\tpublic void move() {\n" +
				"\t\tlong start = System.currentTimeMillis();\n" +
				"\t\ttank.move();\n" +
				"\t\tlong end = System.currentTimeMillis();\n" +
				"\t\tSystem.out.println(\"run time: \" + (end - start) + \" 毫秒\");\n" +
				"\t}\n" +
				"}";
		// String fileName = System.getProperty("user.dir") + "/src/com/test/proxy5/TankProxy.java";
		File myFile = new File("d:/src/com/test/proxy5/");
		if (!myFile.exists()) { myFile.mkdirs();}
		String fileName = "d:/src/com/test/proxy5/TankProxy.java";
		File file = new File(fileName);
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(src);
		fileWriter.flush();
		fileWriter.close();
		// 编译源码
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println(compiler);
		// 编译的过程有错误可以由diagnosticListener来监听和收集，locale和国际化相关
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		Iterable<? extends JavaFileObject> javaFileObjects = fileManager.getJavaFileObjects(fileName);
		CompilationTask task = compiler.getTask(null, fileManager, null, null, null, javaFileObjects);
		task.call();
		fileManager.close();
		// 加载字节码文件到内存并实例化，这种方法还可以从网上下载字节码文件并加载到内存
		//URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") + "/src")};
		URL[] urls = new URL[] {new URL("file:/d:src/")};
		URLClassLoader classLoader = new URLClassLoader(urls);
		Class<?> clazz = classLoader.loadClass("com.test.proxy5.TankProxy");
		System.out.println(clazz);
		// 实例化
		// clazz.newInstance(); 这行代码会调用这个类的无参构造方法，但我们没有无参的构造方法
		Constructor<?> constructor = clazz.getConstructor(Moveable.class);
		// 传入的参数就是被代理对象，代理对象会把它组合为成员变量
		Moveable tankProxy = (Moveable)constructor.newInstance(new Tank());
		tankProxy.move();
	}
}
