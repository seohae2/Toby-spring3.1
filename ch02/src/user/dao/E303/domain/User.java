package user.dao.E303.domain;

public class User {
	String id;
	String name;
	String password;
	
	// �ڹٺ��� �Ծ࿡ ������ Ŭ������ �����ڸ� ���������� �߰��Ҷ�����,
	// �Ķ���Ͱ� ���� ����Ʈ �����ڵ� �Բ� ����������Ѵ�.
	public User() {
	}
	
	// �Ķ����Ͱ� �ִ� User Ŭ���� �����ڸ� �߰��ߴ�.
	public User(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}