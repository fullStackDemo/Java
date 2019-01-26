package com.test;

class User {
	private Integer id;
	private String name;
	private String email;

	public User(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public void SetEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "User [id=" + id + ", name=" + name + ",email=" + email + "]";
	}
}

public class SystemArrayCopy {

	public static void main(String[] args) {
		User[] users = new User[] { new User(11, "w", "w@mail.com"), new User(12, "z", "z@mail.com") };
		System.out.println(users);
		for (User user : users) {
			System.out.println(user.toString());
		}
		User[] desUsers = new User[users.length];

		System.arraycopy(users, 0, desUsers, 0, users.length);

		desUsers[0].SetEmail("88@mail.com");

		System.out.println(users[0] == desUsers[0] ? "浅复制" : "深复制");

		for (User user : desUsers) {
			System.out.println(user.toString());
		}
		for (User user : users) {
			System.out.println(user.toString());
		}

	}
}
