package com.test.proxy1;

public interface PersonBean {
    // 姓名
	String getName();
	// 性别
	String getGender();
	// 爱好
	String getInterests();
	// 评分
	int getHotOrNotRating();
 
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating); 
 
}
