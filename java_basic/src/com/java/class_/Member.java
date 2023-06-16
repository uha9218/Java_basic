package com.java.class_;

public class Member {
	private String id;
	private String pwd;

	public boolean equals(Object obj) {
		// return super.equals(obj); obj 메소드에서 하던대로

		boolean result = false;
		if (obj instanceof Member) {	//멤버 인스턴스인지 확인
			Member other = (Member)obj;	//오브젝트 레퍼런스를 멤버로 바꿈(오브젝트 타입에는 getId라는 메소드가 없음)
		if (other.getId().equals(id)) {	
			// other.getId는 String을 반환함 
			// equals : String의 equals호출
				result = true;
			}
		}
		return result;

	}
	

	@Override
	public int hashCode() {
		return id.hashCode();
	}
	

	@Override
	public String toString() {
		return id;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
