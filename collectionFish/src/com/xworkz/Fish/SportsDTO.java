package com.xworkz.Fish;




	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.LocalTime;

	public class SportsDTO {

		private String sportName;
		private String playerName;
		private int age;
		private int noOfPlayers;
		private String location;
		private String education;
		private String dateOfBirth;
		private int salary;
		private LocalDate date;
		private LocalTime time;

		public SportsDTO(String sportName, String playerName, int age, int noOfPlayers, String location, String education,
				String dateOfBirth, int salary, LocalDate date, LocalTime time) {
			super();
			this.sportName = sportName;
			this.playerName = playerName;
			this.age = age;
			this.noOfPlayers = noOfPlayers;
			this.location = location;
			this.education = education;
			this.dateOfBirth = dateOfBirth;
			this.salary = salary;
			this.date = date;
			this.time = time;
			
			
		}

		public String getSportName() {
			return sportName;
		}

		public void setSportName(String sportName) {
			this.sportName = sportName;
		}

		public String getPlayerName() {
			return playerName;
		}

		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getNoOfPlayers() {
			return noOfPlayers;
		}

		public void setNoOfPlayers(int noOfPlayers) {
			this.noOfPlayers = noOfPlayers;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getEducation() {
			return education;
		}

		public void setEducation(String education) {
			this.education = education;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public LocalTime getTime() {
			return time;
		}

		public void setTime(LocalTime time) {
			this.time = time;
		}

		@Override
		public String toString() {
			return "SportsDTO [sportName=" + sportName + ", playerName=" + playerName + ", age=" + age + ", noOfPlayers="
					+ noOfPlayers + ", location=" + location + ", education=" + education + ", dateOfBirth=" + dateOfBirth
					+ ", salary=" + salary + ", date=" + date + ", time=" + time + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if (obj != null) {
				if (obj instanceof SportsDTO) {
					SportsDTO sportsDTO = (SportsDTO) obj;
					if (sportsDTO.sportName.equals(sportName) && sportsDTO.playerName.equals(playerName)) {
						return true;
					}

				}

			}
			return super.equals(obj);
		}
	}

