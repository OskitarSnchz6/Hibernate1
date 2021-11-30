package com.add.Hibernate;

public class User {
		
		private int id;
		private String userName;
		private String userMessage;
		
		public User(Integer id, String userName, String userMessage) {
			this.id = id;
			this.userName = userName;
			this.userMessage = userMessage;
		}
	 
		public User() {
			super ();
		}

		public int getId() {
			return id;
		}
	 
		public void setId(int id) {
			this.id = id;
		}
	 
		public String getUserName() {
			return userName;
		}
	 
		public void setUserName(String userName) {
			this.userName = userName;
		}
	 
		public String getUserMessage() {
			return userMessage;
		}
	 
		public void setUserMessage(String userMessage) {
			this.userMessage = userMessage;
		}
}