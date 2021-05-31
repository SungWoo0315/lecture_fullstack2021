package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}

	// P412, insertMember()
	public void insertMember(Member m, int index) {
		arrayList.add(index, m);
	}
	
	public void addMember(Member m) {
		arrayList.add(m);
	}
	
	public boolean removeMember(int memberId) {
		for(int i =0; i<arrayList.size(); i++){ // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(i);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		// 2번째 방법
		/*Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(member);      // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		} */
		
		System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
		return false;    
		
	}

	public void showAllMembers() {
		for (Member m : arrayList) {
			System.out.println(m);
		}
		System.out.println();
	}

}
