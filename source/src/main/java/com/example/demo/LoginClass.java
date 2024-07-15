package com.example.demo;

import java.util.ArrayList;

public class LoginClass {
	private ArrayList<MemberInfoClass> memberList = null;
		
	LoginClass() {
		//데이터 임의로 넣기
		memberList = new ArrayList<>();
		MemberInfoClass memberInfo = new MemberInfoClass();
		memberInfo.setId("hong");
		memberInfo.setName("홍길동");
		memberInfo.setPassword("hong12345");
		
		MemberInfoClass memberInfo2 = new MemberInfoClass();
		memberInfo2.setId("kim");
		memberInfo2.setName("김정우");
		memberInfo2.setPassword("kim12345");
		
		MemberInfoClass memberInfo3 = new MemberInfoClass();
		memberInfo3.setId("lee");
		memberInfo3.setName("이민형");
		memberInfo3.setPassword("lee12345");
		
		memberList.add(memberInfo);
		memberList.add(memberInfo2);
		memberList.add(memberInfo3);
	}
	
	public boolean login(MemoRepository memoDao, String userId, String userPassword) {
//		boolean isFinding = false;
		Long findCount = memoDao.countByUserIdAndPassword(userId, userPassword);
		if(findCount <= 0) {
			return false;
		} else {
			return true;
		}
//		for(MemberInfoClass item : memberList) {
//			System.out.println("DB ==> " + item.getId());
//			if(item.getId().equals(userId) && item.getPassword().equals(userPassword)) {
//				isFinding = true;
//				break;
//			}
//		}
//		return isFinding;
	}
	
	public boolean logout() {
		return true;
	}
}
