package com.xworkz.Fish;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SportsRunner {

	public static void main(String[] args) {
		SportsDTO sport1 = new SportsDTO("Cricket", "Thornton Blake", 26, 8, "Rockhill Stadium", "High School",
				"1995-08-10", 61001, LocalDate.of(2018, 07, 06), LocalTime.of(17, 47, 20));
		SportsDTO sport2 = new SportsDTO("Cricket", "Emerson Whitney", 25, 7, "Cucumber Stadium", "Master s Degree",
				"1980-06-19", 79852, LocalDate.of(2013, 02, 15), LocalTime.of(22, 52, 41));
		SportsDTO sport3 = new SportsDTO("Cricket", "Little Klein", 27, 7, "Rose Stadium", "High School", "1998-02-12",
				53269, LocalDate.of(2014, 04, 19), LocalTime.of(18, 05, 13));
		SportsDTO sport4 = new SportsDTO("FootBall", "Gould Dorsey", 27, 8, "Ticonderoga Stadium", "Associate s Degree",
				"1984-12-16", 48280, LocalDate.of(2013, 01, 06), LocalTime.of(19, 07, 43));
		SportsDTO sport5 = new SportsDTO("FootBall", "Hurley Griffin", 21, 11, "Foscoe Stadium", "High School",
				"1984-09-04", 55697, LocalDate.of(2016, 8, 15), LocalTime.of(16, 36, 19));
		SportsDTO sport6 = new SportsDTO("FootBall", "Eaton Chambers", 22, 7, "Sunwest Stadium", "High School",
				"1990-09-09", 72719, LocalDate.of(2022, 02, 15), LocalTime.of(8, 27, 04));
		SportsDTO sport7 = new SportsDTO("BasketBall", "Ursula Parker", 31, 8, "Crawfordsville Stadium",
				"Master s Degree", "1988-04-09", 61774, LocalDate.of(2010, 07, 17), LocalTime.of(14, 48, 49));
		SportsDTO sport8 = new SportsDTO("FootBall", "Jody Carr", 26, 10, "Why Stadium", "Associate s Degree",
				"1986-12-23", 49439, LocalDate.of(2023, 02, 06), LocalTime.of(06, 02, 52));
		SportsDTO sport9 = new SportsDTO("Cricket", "Roth Patrick", 28, 11, "Nipinnawasee Stadium", "Master s Degree",
				"1998-06-11", 65538, LocalDate.of(2010, 06, 9), LocalTime.of(21, 19, 44));
		SportsDTO sport10 = new SportsDTO("BasketBall", "Noble Riley", 22, 10, "Singer Stadium", "High School",
				"1989-08-25", 62606, LocalDate.of(2016, 10, 29), LocalTime.of(22, 17, 11));
		SportsDTO sport11 = new SportsDTO("Cricket", "Katina Perry", 34, 6, "Epworth Stadium", "Bachelor Degree",
				"1999-04-17", 43340, LocalDate.of(2020, 06, 9), LocalTime.of(13, 00, 55));
		SportsDTO sport12 = new SportsDTO("BasketBall", "Becky Lester", 35, 10, "Riner Stadium", "High School",
				"2000-09-23", 47453, LocalDate.of(2013, 03, 03), LocalTime.of(17, 15, 14));
		SportsDTO sport13 = new SportsDTO("BasketBall", "Sofia Navarro", 32, 9, "Fannett Stadium", "High School",
				"1993-01-18", 53864, LocalDate.of(2022, 01, 11), LocalTime.of(11, 24, 32));
		SportsDTO sport14 = new SportsDTO("FootBall", "Anderson Cummings", 34, 7, "Crown Stadium", "High School",
				"1982-07-27", 49631, LocalDate.of(2023, 9, 26), LocalTime.of(03, 26, 22));
		SportsDTO sport15 = new SportsDTO("Cricket", "Christa Casey", 20, 11, "Robbins Stadium", "Bachelor Degree",
				"1991-03-19", 63616, LocalDate.of(2021, 12, 24), LocalTime.of(06, 35, 43));
		SportsDTO sport16 = new SportsDTO("Cricket", "Katrina Lancaster", 23, 10, "Sussex Stadium", "Master s Degree",
				"1992-12-01", 62935, LocalDate.of(2019, 12, 06), LocalTime.of(06, 37, 12));
		SportsDTO sport17 = new SportsDTO("Cricket", "Jessie Mcclure", 28, 5, "Gordon Stadium", "Bachelor Degree",
				"1992-05-11", 76804, LocalDate.of(2020, 05, 23), LocalTime.of(18, 42, 05));
		SportsDTO sport18 = new SportsDTO("Cricket", "Patterson Deleon", 31, 11, "Fairview Stadium", "Master s Degree",
				"1993-12-07", 46988, LocalDate.of(2020, 06, 04), LocalTime.of(06, 12, 42));
		SportsDTO sport19 = new SportsDTO("FootBall", "Deann Sherman", 22, 9, "Adelino Stadium", "Bachelor Degree",
				"1994-02-07", 74671, LocalDate.of(2017, 07, 23), LocalTime.of(10, 24, 40));
		SportsDTO sport20 = new SportsDTO("Cricket", "Justice Holden", 26, 8, "Oberlin Stadium", "Master s Degree",
				"1987-05-25", 69800, LocalDate.of(2012, 12, 14), LocalTime.of(18, 14, 47));
		SportsDTO sport21 = new SportsDTO("BasketBall", "Allison Bolton", 30, 6, "Trexlertown Stadium",
				"Associate s Degree", "1988-05-08", 78479, LocalDate.of(2014, 02, 22), LocalTime.of(13, 39, 51));
		SportsDTO sport22 = new SportsDTO("BasketBall", "Barr Mccormick", 29, 11, "Campo Stadium", "High School",
				"1988-09-21", 69216, LocalDate.of(2023, 10, 10), LocalTime.of(03, 10, 49));
		SportsDTO sport23 = new SportsDTO("FootBall", "Lourdes Strong", 20, 9, "Rosburg Stadium", "Bachelor Degree",
				"1982-09-19", 64630, LocalDate.of(2014, 11, 25), LocalTime.of(06, 33, 10));
		SportsDTO sport24 = new SportsDTO("BasketBall", "Quinn Hawkins", 20, 9, "Chamberino Stadium", "High School",
				"1994-06-07", 71020, LocalDate.of(2022, 01, 31), LocalTime.of(14, 36, 07));
		SportsDTO sport25 = new SportsDTO("Cricket", "Dorthy Duke", 20, 10, "Wells Stadium", "Master s Degree",
				"1991-01-12", 40675, LocalDate.of(2012, 07, 14), LocalTime.of(23, 27, 06));
		SportsDTO sport26 = new SportsDTO("FootBall", "Marquita Garcia", 27, 9, "Slovan Stadium", "High School",
				"2003-06-18", 41120, LocalDate.of(2018, 07, 21), LocalTime.of(05, 41, 57));
		SportsDTO sport27 = new SportsDTO("Cricket", "Singleton Avila", 34, 7, "Edgar Stadium", "High School",
				"1985-10-02", 68591, LocalDate.of(2017, 12, 19), LocalTime.of(9, 14, 06));
		SportsDTO sport28 = new SportsDTO("FootBall", "Terri Nichols", 34, 5, "Lumberton Stadium", "Associate s Degree",
				"1993-10-19", 40940, LocalDate.of(2019, 12, 14), LocalTime.of(18, 06, 35));
		SportsDTO sport29 = new SportsDTO("Cricket", "Blanche Harmon", 34, 10, "Camas Stadium", "High School",
				"1998-03-16", 63950, LocalDate.of(2018, 07, 20), LocalTime.of(04, 52, 26));
		SportsDTO sport30 = new SportsDTO("Cricket", "Moore Stanley", 20, 6, "Unionville Stadium", "Associate s Degree",
				"1988-02-17", 40525, LocalDate.of(2014, 8, 12), LocalTime.of(06, 34, 44));
		SportsDTO sport31 = new SportsDTO("Cricket", "Luella Knapp", 24, 11, "Wacissa Stadium", "Bachelor Degree",
				"1997-01-17", 59162, LocalDate.of(2015, 11, 9), LocalTime.of(13, 11, 26));
		SportsDTO sport32 = new SportsDTO("BasketBall", "Maureen Galloway", 29, 9, "Windsor Stadium", "High School",
				"2002-02-14", 60584, LocalDate.of(2015, 9, 05), LocalTime.of(16, 25, 53));
		SportsDTO sport33 = new SportsDTO("BasketBall", "Leslie Parks", 23, 9, "Greenbackville Stadium",
				"Associate s Degree", "1991-09-06", 72404, LocalDate.of(2017, 05, 10), LocalTime.of(23, 40, 36));
		SportsDTO sport34 = new SportsDTO("FootBall", "Annie Hill", 22, 11, "Faxon Stadium", "Master s Degree",
				"2001-02-11", 46541, LocalDate.of(2016, 03, 04), LocalTime.of(07, 52, 34));
		SportsDTO sport35 = new SportsDTO("BasketBall", "Rowe Gilmore", 27, 6, "Belvoir Stadium", "Associate s Degree",
				"1995-01-10", 69002, LocalDate.of(2011, 06, 16), LocalTime.of(04, 06, 59));
		SportsDTO sport36 = new SportsDTO("FootBall", "Fannie Jenkins", 31, 11, "Fairforest Stadium",
				"Associate s Degree", "1992-11-10", 76718, LocalDate.of(2010, 03, 06), LocalTime.of(19, 07, 56));
		SportsDTO sport37 = new SportsDTO("Cricket", "Reilly English", 32, 10, "Stouchsburg Stadium", "High School",
				"1989-06-16", 62290, LocalDate.of(2015, 12, 28), LocalTime.of(15, 21, 16));
		SportsDTO sport38 = new SportsDTO("FootBall", "Aida Maddox", 27, 5, "Fedora Stadium", "Associate s Degree",
				"1983-08-13", 49124, LocalDate.of(2014, 8, 8), LocalTime.of(17, 17, 31));
		SportsDTO sport39 = new SportsDTO("FootBall", "Hall Hardy", 27, 7, "Vernon Stadium", "Bachelor Degree",
				"1986-10-22", 69062, LocalDate.of(2017, 9, 17), LocalTime.of(15, 05, 28));
		SportsDTO sport40 = new SportsDTO("BasketBall", "Eula House", 29, 6, "Babb Stadium", "Bachelor Degree",
				"1997-01-16", 46984, LocalDate.of(2015, 12, 27), LocalTime.of(16, 37, 07));
		SportsDTO sport41 = new SportsDTO("Cricket", "Kemp Tyler", 21, 11, "Rosewood Stadium", "Associate s Degree",
				"2002-01-09", 71175, LocalDate.of(2020, 07, 18), LocalTime.of(18, 48, 19));
		SportsDTO sport42 = new SportsDTO("FootBall", "Mcknight Roy", 30, 9, "Grandview Stadium", "Associate s Degree",
				"1986-02-08", 55092, LocalDate.of(2018, 8, 29), LocalTime.of(00, 35, 29));
		SportsDTO sport43 = new SportsDTO("Cricket", "Lee Barber", 31, 8, "Osage Stadium", "Associate s Degree",
				"1988-02-03", 73930, LocalDate.of(2022, 03, 16), LocalTime.of(02, 02, 16));
		SportsDTO sport44 = new SportsDTO("Cricket", "Castillo Phelps", 35, 9, "Clayville Stadium", "Master s Degree",
				"1982-11-19", 74827, LocalDate.of(2022, 03, 11), LocalTime.of(8, 01, 34));
		SportsDTO sport45 = new SportsDTO("Cricket", "Angie Morin", 33, 11, "Dunbar Stadium", "Master s Degree",
				"1993-06-10", 43869, LocalDate.of(2010, 05, 19), LocalTime.of(03, 42, 11));
		SportsDTO sport46 = new SportsDTO("Cricket", "Newman Gardner", 35, 8, "Sanders Stadium", "Associate s Degree",
				"1984-04-03", 47551, LocalDate.of(2014, 03, 06), LocalTime.of(23, 47, 12));
		SportsDTO sport47 = new SportsDTO("BasketBall", "Laura Clayton", 21, 11, "Lodoga Stadium", "Associate s Degree",
				"2003-10-10", 43300, LocalDate.of(2023, 03, 26), LocalTime.of(03, 05, 13));
		SportsDTO sport48 = new SportsDTO("Cricket", "Mable Lopez", 30, 11, "Sharon Stadium", "Bachelor Degree",
				"1992-04-24", 43460, LocalDate.of(2011, 10, 05), LocalTime.of(13, 13, 19));
		SportsDTO sport49 = new SportsDTO("BasketBall", "Kate Mcgowan", 32, 5, "Torboy Stadium", "Bachelor Degree",
				"1994-12-18", 73524, LocalDate.of(2010, 04, 02), LocalTime.of(06, 26, 37));
		SportsDTO sport50 = new SportsDTO("BasketBall", "Dixon Potter", 35, 8, "Fillmore Stadium", "Master s Degree",
				"2002-11-01", 65830, LocalDate.of(2019, 8, 01), LocalTime.of(17, 43, 18));
		SportsDTO sport51 = new SportsDTO("Cricket", "Dickson Ross", 24, 5, "Mulino Stadium", "High School",
				"1984-11-14", 62168, LocalDate.of(2014, 03, 06), LocalTime.of(01, 25, 47));
		SportsDTO sport52 = new SportsDTO("Cricket", "Spencer Everett", 26, 9, "Garfield Stadium", "Associate s Degree",
				"1993-09-15", 71633, LocalDate.of(2017, 12, 03), LocalTime.of(8, 40, 48));
		SportsDTO sport53 = new SportsDTO("BasketBall", "Tricia Hopkins", 31, 6, "Virgie Stadium", "Bachelor Degree",
				"1985-03-03", 59060, LocalDate.of(2021, 02, 07), LocalTime.of(23, 02, 13));
		SportsDTO sport54 = new SportsDTO("BasketBall", "Price Barrett", 23, 5, "Trinway Stadium", "Bachelor Degree",
				"1998-08-17", 54893, LocalDate.of(2022, 04, 01), LocalTime.of(12, 35, 37));
		SportsDTO sport55 = new SportsDTO("BasketBall", "Logan Little", 23, 9, "Fresno Stadium", "Master s Degree",
				"1988-10-08", 44718, LocalDate.of(2022, 05, 11), LocalTime.of(15, 07, 00));
		SportsDTO sport56 = new SportsDTO("BasketBall", "Kirk Bauer", 32, 11, "Belfair Stadium", "Associate s Degree",
				"2003-02-08", 65235, LocalDate.of(2016, 9, 21), LocalTime.of(16, 22, 54));
		SportsDTO sport57 = new SportsDTO("BasketBall", "Burt Kane", 21, 5, "Fairmount Stadium", "Associate s Degree",
				"1998-11-18", 72951, LocalDate.of(2019, 05, 03), LocalTime.of(23, 17, 04));
		SportsDTO sport58 = new SportsDTO("FootBall", "Alyce Good", 22, 6, "Hachita Stadium", "Associate s Degree",
				"1988-12-04", 72036, LocalDate.of(2021, 10, 24), LocalTime.of(01, 39, 06));
		SportsDTO sport59 = new SportsDTO("Cricket", "Cross Lang", 22, 8, "Axis Stadium", "High School", "1984-08-22",
				72582, LocalDate.of(2012, 8, 22), LocalTime.of(13, 18, 50));
		SportsDTO sport60 = new SportsDTO("BasketBall", "Bonnie Erickson", 20, 11, "Remington Stadium",
				"Bachelor Degree", "1997-11-07", 66738, LocalDate.of(2012, 12, 23), LocalTime.of(8, 57, 50));
		SportsDTO sport61 = new SportsDTO("FootBall", "Rena Bruce", 34, 7, "Orason Stadium", "High School",
				"1999-04-01", 62387, LocalDate.of(2021, 10, 26), LocalTime.of(03, 59, 19));
		SportsDTO sport62 = new SportsDTO("FootBall", "Concepcion Cortez", 35, 5, "Reno Stadium", "Associate s Degree",
				"1995-09-06", 67326, LocalDate.of(2013, 05, 23), LocalTime.of(03, 14, 56));
		SportsDTO sport63 = new SportsDTO("Cricket", "Parker French", 23, 10, "Cliffside Stadium", "Associate s Degree",
				"1991-08-25", 55148, LocalDate.of(2010, 10, 12), LocalTime.of(01, 02, 44));
		SportsDTO sport64 = new SportsDTO("BasketBall", "Doris Barker", 28, 9, "Boling Stadium", "Associate s Degree",
				"1983-04-03", 40431, LocalDate.of(2012, 01, 23), LocalTime.of(18, 24, 17));
		SportsDTO sport65 = new SportsDTO("BasketBall", "Rosemarie Oneil", 26, 8, "Ola Stadium", "High School",
				"1987-03-03", 75217, LocalDate.of(2011, 11, 12), LocalTime.of(22, 51, 18));
		SportsDTO sport66 = new SportsDTO("BasketBall", "Hannah Holt", 25, 10, "Saticoy Stadium", "Master s Degree",
				"1987-12-26", 67793, LocalDate.of(2020, 11, 16), LocalTime.of(21, 45, 20));
		SportsDTO sport67 = new SportsDTO("FootBall", "Eleanor Pearson", 26, 6, "Cochranville Stadium", "High School",
				"2002-06-08", 65369, LocalDate.of(2015, 07, 24), LocalTime.of(15, 40, 22));
		SportsDTO sport68 = new SportsDTO("BasketBall", "Francine Hodge", 33, 9, "Eggertsville Stadium",
				"Bachelor Degree", "1996-08-08", 70599, LocalDate.of(2015, 06, 23), LocalTime.of(03, 22, 50));
		SportsDTO sport69 = new SportsDTO("BasketBall", "Victoria Dean", 31, 11, "Hayden Stadium", "Bachelor Degree",
				"1982-06-02", 50525, LocalDate.of(2021, 01, 06), LocalTime.of(05, 26, 19));
		SportsDTO sport70 = new SportsDTO("FootBall", "Dina Mcgee", 30, 6, "Carrsville Stadium", "Associate s Degree",
				"1981-06-29", 60386, LocalDate.of(2022, 07, 05), LocalTime.of(9, 00, 13));
		SportsDTO sport71 = new SportsDTO("BasketBall", "Kristin Hurley", 22, 6, "Chalfant Stadium", "High School",
				"1996-08-28", 69270, LocalDate.of(2012, 9, 28), LocalTime.of(17, 02, 41));
		SportsDTO sport72 = new SportsDTO("FootBall", "Cohen Rodriguez", 34, 11, "Garberville Stadium",
				"Associate s Degree", "1996-05-02", 56664, LocalDate.of(2021, 05, 15), LocalTime.of(02, 57, 42));
		SportsDTO sport73 = new SportsDTO("BasketBall", "Oconnor Sanford", 28, 10, "Villarreal Stadium",
				"Master s Degree", "1982-02-08", 72604, LocalDate.of(2010, 03, 17), LocalTime.of(18, 59, 10));
		SportsDTO sport74 = new SportsDTO("FootBall", "Small Mullen", 24, 11, "Tilden Stadium", "Associate s Degree",
				"1988-04-09", 53719, LocalDate.of(2010, 8, 25), LocalTime.of(8, 10, 12));
		SportsDTO sport75 = new SportsDTO("Cricket", "Gates Solis", 24, 9, "Waikele Stadium", "Master s Degree",
				"1988-02-21", 50742, LocalDate.of(2013, 06, 30), LocalTime.of(04, 32, 33));
		SportsDTO sport76 = new SportsDTO("FootBall", "Marcie Berger", 32, 11, "Delshire Stadium", "Associate s Degree",
				"1993-10-07", 57008, LocalDate.of(2012, 10, 29), LocalTime.of(20, 33, 10));
		SportsDTO sport77 = new SportsDTO("FootBall", "Bartlett Mcclain", 21, 11, "Eureka Stadium", "High School",
				"1982-01-18", 61721, LocalDate.of(2020, 02, 11), LocalTime.of(11, 34, 36));
		SportsDTO sport78 = new SportsDTO("FootBall", "Ashley Hahn", 20, 5, "Thatcher Stadium", "High School",
				"1981-02-24", 76230, LocalDate.of(2020, 9, 05), LocalTime.of(05, 30, 16));
		SportsDTO sport79 = new SportsDTO("BasketBall", "Moody Harrington", 25, 6, "Taycheedah Stadium", "High School",
				"2002-09-06", 56868, LocalDate.of(2015, 07, 03), LocalTime.of(17, 23, 29));
		SportsDTO sport80 = new SportsDTO("FootBall", "Cline Davis", 32, 6, "Longoria Stadium", "Master s Degree",
				"1990-02-25", 70712, LocalDate.of(2012, 03, 9), LocalTime.of(11, 8, 00));
		SportsDTO sport81 = new SportsDTO("BasketBall", "Kerry Gilbert", 27, 5, "Westwood Stadium", "Bachelor Degree",
				"1980-11-14", 46479, LocalDate.of(2012, 11, 04), LocalTime.of(15, 8, 17));
		SportsDTO sport82 = new SportsDTO("Cricket", "Mack Fisher", 21, 9, "Hickory Stadium", "Master s Degree",
				"2000-09-07", 78139, LocalDate.of(2018, 06, 24), LocalTime.of(15, 41, 30));
		SportsDTO sport83 = new SportsDTO("BasketBall", "Waters Wilder", 31, 8, "Dotsero Stadium", "Master s Degree",
				"1985-11-28", 48906, LocalDate.of(2022, 01, 03), LocalTime.of(04, 34, 06));
		SportsDTO sport84 = new SportsDTO("FootBall", "Allie Henderson", 22, 6, "Foxworth Stadium", "Master s Degree",
				"1986-06-01", 49476, LocalDate.of(2020, 03, 10), LocalTime.of(21, 10, 37));
		SportsDTO sport85 = new SportsDTO("Cricket", "Chan Drake", 29, 8, "Motley Stadium", "Master s Degree",
				"1999-09-06", 60697, LocalDate.of(2015, 10, 23), LocalTime.of(20, 46, 43));
		SportsDTO sport86 = new SportsDTO("Cricket", "Hodges Hopper", 23, 7, "Century Stadium", "Bachelor Degree",
				"2001-11-19", 72124, LocalDate.of(2019, 07, 29), LocalTime.of(18, 13, 17));
		SportsDTO sport87 = new SportsDTO("BasketBall", "Jensen Rivers", 34, 6, "Summertown Stadium", "Bachelor Degree",
				"1982-08-23", 41752, LocalDate.of(2014, 01, 04), LocalTime.of(22, 20, 37));
		SportsDTO sport88 = new SportsDTO("FootBall", "Reeves Hampton", 22, 8, "Carrizo Stadium", "Master s Degree",
				"1992-07-13", 65023, LocalDate.of(2021, 10, 05), LocalTime.of(02, 56, 28));
		SportsDTO sport89 = new SportsDTO("FootBall", "Deleon Cain", 22, 8, "Hollins Stadium", "Master s Degree",
				"2001-05-25", 60875, LocalDate.of(2021, 07, 01), LocalTime.of(03, 26, 16));
		SportsDTO sport90 = new SportsDTO("Cricket", "Cherie Stevens", 22, 6, "Dyckesville Stadium", "Master s Degree",
				"1980-08-12", 49176, LocalDate.of(2012, 06, 14), LocalTime.of(10, 47, 13));
		SportsDTO sport91 = new SportsDTO("FootBall", "Joyce Salinas", 34, 11, "Brooktrails Stadium", "Bachelor Degree",
				"1992-02-09", 69658, LocalDate.of(2023, 10, 07), LocalTime.of(21, 12, 04));
		SportsDTO sport92 = new SportsDTO("BasketBall", "Hazel Rosa", 26, 7, "Clarksburg Stadium", "Associate s Degree",
				"1984-07-15", 49194, LocalDate.of(2014, 06, 11), LocalTime.of(01, 30, 01));
		SportsDTO sport93 = new SportsDTO("BasketBall", "Medina Stuart", 21, 5, "Munjor Stadium", "Master s Degree",
				"1995-05-17", 65922, LocalDate.of(2014, 05, 28), LocalTime.of(07, 45, 36));
		SportsDTO sport94 = new SportsDTO("Cricket", "Madden Hays", 27, 11, "Tuttle Stadium", "High School",
				"2001-03-07", 46396, LocalDate.of(2014, 12, 16), LocalTime.of(05, 45, 37));
		SportsDTO sport95 = new SportsDTO("BasketBall", "Rhea Beard", 30, 5, "Yorklyn Stadium", "High School",
				"1989-06-25", 63158, LocalDate.of(2013, 07, 13), LocalTime.of(03, 31, 45));
		SportsDTO sport96 = new SportsDTO("FootBall", "Phoebe Foreman", 21, 9, "Wikieup Stadium", "Associate s Degree",
				"1984-10-10", 42957, LocalDate.of(2010, 11, 23), LocalTime.of(11, 21, 55));
		SportsDTO sport97 = new SportsDTO("FootBall", "Weiss Francis", 30, 5, "Naomi Stadium", "Bachelor Degree",
				"2002-08-19", 50892, LocalDate.of(2010, 03, 20), LocalTime.of(23, 25, 53));
		SportsDTO sport98 = new SportsDTO("FootBall", "Lula Mccoy", 33, 8, "Valle Stadium", "Master s Degree",
				"1985-09-20", 50691, LocalDate.of(2010, 04, 28), LocalTime.of(06, 55, 04));
		SportsDTO sport99 = new SportsDTO("BasketBall", "Burnett Nolan", 28, 5, "Lowell Stadium", "High School",
				"1990-10-12", 53866, LocalDate.of(2016, 05, 31), LocalTime.of(8, 19, 13));
		SportsDTO sport100 = new SportsDTO("Cricket", "Butler Sanchez", 30, 6, "Dixonville Stadium", "High School",
				"1990-08-07", 67639, LocalDate.of(2013, 03, 8), LocalTime.of(06, 21, 43));
		SportsDTO sport101 = new SportsDTO("BasketBall", "Corinne Charles", 32, 7, "Tyro Stadium", "High School",
				"1983-09-18", 69611, LocalDate.of(2010, 07, 13), LocalTime.of(15, 42, 29));
		SportsDTO sport102 = new SportsDTO("BasketBall", "Judith Mosley", 27, 5, "Veyo Stadium", "Master s Degree",
				"1998-07-30", 76516, LocalDate.of(2018, 07, 25), LocalTime.of(15, 18, 11));
		SportsDTO sport103 = new SportsDTO("FootBall", "Rosa Rogers", 24, 8, "Bethpage Stadium", "Bachelor Degree",
				"1982-09-06", 59206, LocalDate.of(2014, 9, 25), LocalTime.of(04, 44, 25));
		SportsDTO sport104 = new SportsDTO("Cricket", "Audra Crawford", 33, 6, "Sexton Stadium", "Associate s Degree",
				"1990-04-14", 56492, LocalDate.of(2022, 07, 31), LocalTime.of(13, 48, 33));
		SportsDTO sport105 = new SportsDTO("Cricket", "Adeline Alvarez", 22, 8, "Nadine Stadium", "Bachelor Degree",
				"1983-04-25", 71962, LocalDate.of(2019, 11, 10), LocalTime.of(11, 59, 57));
		SportsDTO sport106 = new SportsDTO("FootBall", "Tasha Berry", 32, 8, "Alden Stadium", "High School",
				"1982-06-23", 60824, LocalDate.of(2021, 01, 07), LocalTime.of(05, 23, 02));
		SportsDTO sport107 = new SportsDTO("FootBall", "Jacquelyn Browning", 31, 8, "Camino Stadium",
				"Associate s Degree", "1993-11-30", 47888, LocalDate.of(2021, 8, 28), LocalTime.of(14, 43, 53));
		SportsDTO sport108 = new SportsDTO("FootBall", "Wilda Martin", 35, 7, "Lawrence Stadium", "High School",
				"1992-10-13", 73267, LocalDate.of(2016, 07, 24), LocalTime.of(23, 06, 10));
		SportsDTO sport109 = new SportsDTO("BasketBall", "Geneva Holcomb", 21, 11, "Reinerton Stadium", "High School",
				"1987-05-30", 49533, LocalDate.of(2015, 04, 23), LocalTime.of(19, 9, 9));
		SportsDTO sport110 = new SportsDTO("Cricket", "Campbell Pate", 35, 10, "Wakarusa Stadium", "High School",
				"1994-05-30", 72230, LocalDate.of(2013, 9, 13), LocalTime.of(22, 50, 02));
		SportsDTO sport111 = new SportsDTO("BasketBall", "Coffey Watkins", 29, 7, "Oceola Stadium",
				"Associate s Degree", "2002-12-02", 42768, LocalDate.of(2019, 05, 25), LocalTime.of(15, 22, 57));
		SportsDTO sport112 = new SportsDTO("FootBall", "Roberta Hudson", 35, 9, "Zeba Stadium", "Bachelor Degree",
				"1985-08-23", 52819, LocalDate.of(2010, 03, 13), LocalTime.of(14, 10, 33));
		SportsDTO sport113 = new SportsDTO("BasketBall", "Ethel Beach", 23, 9, "Levant Stadium", "High School",
				"1983-09-18", 54107, LocalDate.of(2012, 04, 18), LocalTime.of(10, 26, 9));
		SportsDTO sport114 = new SportsDTO("Cricket", "Wanda Snyder", 35, 11, "Brookfield Stadium", "Bachelor Degree",
				"1993-08-30", 55897, LocalDate.of(2012, 06, 16), LocalTime.of(01, 22, 48));
		SportsDTO sport115 = new SportsDTO("Cricket", "Sellers Mcguire", 23, 5, "Tibbie Stadium", "High School",
				"1983-10-24", 69689, LocalDate.of(2011, 11, 26), LocalTime.of(13, 37, 01));
		SportsDTO sport116 = new SportsDTO("FootBall", "Melva Cote", 33, 8, "Jennings Stadium", "Bachelor Degree",
				"1999-07-13", 70668, LocalDate.of(2021, 07, 19), LocalTime.of(15, 35, 14));
		SportsDTO sport117 = new SportsDTO("BasketBall", "Garza Walker", 31, 5, "Lisco Stadium", "High School",
				"1986-03-08", 62698, LocalDate.of(2021, 07, 27), LocalTime.of(01, 10, 16));
		SportsDTO sport118 = new SportsDTO("Cricket", "Christian Hughes", 26, 8, "Denio Stadium", "Master s Degree",
				"1992-08-14", 45682, LocalDate.of(2023, 12, 01), LocalTime.of(16, 46, 23));
		SportsDTO sport119 = new SportsDTO("FootBall", "Laurel Booth", 35, 7, "Hoagland Stadium", "High School",
				"1980-07-09", 46123, LocalDate.of(2016, 8, 22), LocalTime.of(14, 45, 52));
		SportsDTO sport120 = new SportsDTO("FootBall", "Keri Alexander", 35, 11, "Centerville Stadium", "High School",
				"1997-11-10", 68974, LocalDate.of(2016, 9, 18), LocalTime.of(9, 17, 01));
		SportsDTO sport121 = new SportsDTO("Cricket", "Olson Harding", 25, 10, "Bartley Stadium", "Master s Degree",
				"2001-02-17", 79695, LocalDate.of(2020, 11, 05), LocalTime.of(14, 48, 44));
		SportsDTO sport122 = new SportsDTO("BasketBall", "Moon Brennan", 20, 11, "Murillo Stadium",
				"Associate s Degree", "1988-04-29", 72318, LocalDate.of(2021, 11, 01), LocalTime.of(19, 14, 02));
		SportsDTO sport123 = new SportsDTO("FootBall", "Patrice Ray", 21, 7, "Harold Stadium", "High School",
				"1998-07-09", 40959, LocalDate.of(2021, 8, 30), LocalTime.of(01, 07, 04));
		SportsDTO sport124 = new SportsDTO("Cricket", "Carmen Bishop", 23, 11, "Bath Stadium", "High School",
				"2002-05-17", 47336, LocalDate.of(2011, 02, 23), LocalTime.of(17, 26, 36));
		SportsDTO sport125 = new SportsDTO("BasketBall", "Jewell Cruz", 34, 10, "Hampstead Stadium",
				"Associate s Degree", "1985-08-27", 47142, LocalDate.of(2018, 11, 9), LocalTime.of(8, 30, 06));
		SportsDTO sport126 = new SportsDTO("FootBall", "Morales Holder", 30, 9, "Holtville Stadium",
				"Associate s Degree", "2003-02-16", 72148, LocalDate.of(2021, 11, 8), LocalTime.of(8, 16, 46));
		SportsDTO sport127 = new SportsDTO("Cricket", "Gayle Winters", 33, 7, "Felt Stadium", "Bachelor Degree",
				"1989-07-22", 48328, LocalDate.of(2010, 8, 29), LocalTime.of(20, 51, 15));
		SportsDTO sport128 = new SportsDTO("FootBall", "Cara Rosario", 24, 5, "Gilgo Stadium", "Bachelor Degree",
				"1993-02-19", 60267, LocalDate.of(2012, 8, 14), LocalTime.of(11, 41, 11));
		SportsDTO sport129 = new SportsDTO("Cricket", "Bertha Franks", 22, 11, "Mappsville Stadium",
				"Associate s Degree", "1990-05-18", 66683, LocalDate.of(2015, 10, 14), LocalTime.of(22, 17, 01));
		SportsDTO sport130 = new SportsDTO("FootBall", "Greene Spencer", 20, 10, "Osmond Stadium", "Bachelor Degree",
				"1996-06-10", 79519, LocalDate.of(2021, 01, 31), LocalTime.of(17, 05, 24));
		SportsDTO sport131 = new SportsDTO("FootBall", "Ingram Elliott", 30, 6, "Edgewater Stadium", "Bachelor Degree",
				"1999-06-17", 40594, LocalDate.of(2013, 03, 18), LocalTime.of(20, 54, 28));
		SportsDTO sport132 = new SportsDTO("FootBall", "Lidia Combs", 25, 5, "Devon Stadium", "High School",
				"1988-06-06", 54041, LocalDate.of(2016, 02, 13), LocalTime.of(21, 22, 01));
		SportsDTO sport133 = new SportsDTO("Cricket", "Sonya Valencia", 27, 9, "Clay Stadium", "High School",
				"1982-12-05", 61627, LocalDate.of(2020, 04, 16), LocalTime.of(01, 03, 58));
		SportsDTO sport134 = new SportsDTO("FootBall", "Paula Cantu", 34, 11, "Ogema Stadium", "High School",
				"1994-09-21", 66169, LocalDate.of(2021, 07, 9), LocalTime.of(19, 53, 37));
		SportsDTO sport135 = new SportsDTO("FootBall", "Flynn Flowers", 24, 6, "Rockbridge Stadium", "Master s Degree",
				"1994-04-14", 67764, LocalDate.of(2012, 8, 26), LocalTime.of(04, 8, 43));
		SportsDTO sport136 = new SportsDTO("FootBall", "Ortiz Frost", 29, 10, "Keller Stadium", "High School",
				"2000-11-12", 79048, LocalDate.of(2010, 02, 12), LocalTime.of(05, 48, 28));
		SportsDTO sport137 = new SportsDTO("BasketBall", "Kirsten Bailey", 23, 10, "Lemoyne Stadium", "High School",
				"1997-06-13", 51496, LocalDate.of(2013, 06, 19), LocalTime.of(10, 28, 41));
		SportsDTO sport138 = new SportsDTO("FootBall", "Potts Battle", 31, 11, "Enoree Stadium", "Master s Degree",
				"1984-06-13", 75747, LocalDate.of(2016, 01, 23), LocalTime.of(11, 26, 39));
		SportsDTO sport139 = new SportsDTO("FootBall", "Pugh Irwin", 33, 7, "Courtland Stadium", "High School",
				"2003-07-28", 63711, LocalDate.of(2011, 11, 15), LocalTime.of(9, 50, 04));
		SportsDTO sport140 = new SportsDTO("BasketBall", "Shelley Fry", 27, 5, "Warren Stadium", "Associate s Degree",
				"1980-03-22", 66355, LocalDate.of(2014, 9, 12), LocalTime.of(22, 18, 33));
		SportsDTO sport141 = new SportsDTO("BasketBall", "Richard Daugherty", 25, 6, "Cetronia Stadium", "High School",
				"2001-04-23", 63994, LocalDate.of(2011, 02, 15), LocalTime.of(16, 49, 34));
		SportsDTO sport142 = new SportsDTO("Cricket", "Faulkner Knox", 35, 5, "Maury Stadium", "Bachelor Degree",
				"1992-01-15", 61491, LocalDate.of(2011, 01, 03), LocalTime.of(20, 14, 54));
		SportsDTO sport143 = new SportsDTO("BasketBall", "Lynda Hickman", 27, 7, "Iola Stadium", "Associate s Degree",
				"1989-01-11", 54547, LocalDate.of(2023, 12, 9), LocalTime.of(00, 03, 11));
		SportsDTO sport144 = new SportsDTO("FootBall", "Jessica Pratt", 22, 8, "Spelter Stadium", "Bachelor Degree",
				"2003-05-28", 68005, LocalDate.of(2023, 02, 10), LocalTime.of(03, 9, 33));
		SportsDTO sport145 = new SportsDTO("BasketBall", "Foster Rocha", 24, 5, "Chesapeake Stadium", "Bachelor Degree",
				"1983-05-21", 68531, LocalDate.of(2019, 02, 02), LocalTime.of(11, 04, 21));
		SportsDTO sport146 = new SportsDTO("FootBall", "Norma Hodges", 26, 6, "Farmington Stadium", "Bachelor Degree",
				"2002-06-23", 58369, LocalDate.of(2010, 05, 01), LocalTime.of(22, 49, 56));
		SportsDTO sport147 = new SportsDTO("BasketBall", "Rasmussen Molina", 28, 8, "Sandston Stadium",
				"Master s Degree", "1982-09-08", 51519, LocalDate.of(2023, 11, 8), LocalTime.of(00, 10, 9));
		SportsDTO sport148 = new SportsDTO("Cricket", "Cheryl Garrett", 24, 9, "Beechmont Stadium",
				"Associate s Degree", "1994-08-04", 70780, LocalDate.of(2010, 8, 07), LocalTime.of(10, 35, 53));
		SportsDTO sport149 = new SportsDTO("FootBall", "Sheena Kirkland", 30, 5, "Tivoli Stadium", "High School",
				"1990-02-15", 46669, LocalDate.of(2012, 12, 05), LocalTime.of(05, 23, 11));
		SportsDTO sport150 = new SportsDTO("BasketBall", "Hooper Blackburn", 32, 9, "Catherine Stadium", "High School",
				"1993-01-02", 76592, LocalDate.of(2012, 9, 06), LocalTime.of(10, 30, 02));
		SportsDTO sport151 = new SportsDTO("FootBall", "Cheri Shannon", 20, 5, "Omar Stadium", "Master s Degree",
				"1980-01-07", 76800, LocalDate.of(2014, 02, 14), LocalTime.of(13, 26, 05));
		SportsDTO sport152 = new SportsDTO("BasketBall", "Harriett Austin", 20, 6, "Sheatown Stadium", "High School",
				"2001-05-17", 41136, LocalDate.of(2023, 11, 21), LocalTime.of(21, 20, 55));
		SportsDTO sport153 = new SportsDTO("BasketBall", "Elliott Byers", 34, 10, "Gilmore Stadium", "Master s Degree",
				"1997-05-07", 41416, LocalDate.of(2011, 03, 10), LocalTime.of(04, 32, 46));
		SportsDTO sport154 = new SportsDTO("BasketBall", "Bryan Burnett", 24, 11, "Harrison Stadium", "High School",
				"1982-09-30", 71544, LocalDate.of(2011, 11, 23), LocalTime.of(04, 9, 50));
		SportsDTO sport155 = new SportsDTO("FootBall", "Byrd Wiley", 28, 7, "Eden Stadium", "Master s Degree",
				"1981-04-06", 41775, LocalDate.of(2023, 10, 10), LocalTime.of(20, 06, 21));
		SportsDTO sport156 = new SportsDTO("BasketBall", "Taylor Morrow", 28, 8, "Olney Stadium", "Master s Degree",
				"1992-04-19", 57760, LocalDate.of(2016, 9, 13), LocalTime.of(03, 25, 49));
		SportsDTO sport157 = new SportsDTO("BasketBall", "Nixon Kelly", 23, 11, "Brenton Stadium", "Bachelor Degree",
				"1981-05-30", 44427, LocalDate.of(2018, 03, 18), LocalTime.of(20, 29, 04));
		SportsDTO sport158 = new SportsDTO("FootBall", "Alexandria Gates", 34, 8, "Turpin Stadium", "Bachelor Degree",
				"2000-10-09", 43605, LocalDate.of(2022, 8, 26), LocalTime.of(05, 45, 00));
		SportsDTO sport159 = new SportsDTO("BasketBall", "Dolly Hartman", 21, 7, "Salvo Stadium", "High School",
				"1998-08-22", 66584, LocalDate.of(2010, 01, 06), LocalTime.of(19, 24, 55));
		SportsDTO sport160 = new SportsDTO("Cricket", "Terry Bridges", 32, 7, "Shindler Stadium", "Master s Degree",
				"1992-05-23", 41888, LocalDate.of(2012, 04, 03), LocalTime.of(03, 22, 29));
		SportsDTO sport161 = new SportsDTO("BasketBall", "Marks Mathews", 23, 7, "Waukeenah Stadium", "Master s Degree",
				"2003-11-11", 68375, LocalDate.of(2017, 01, 25), LocalTime.of(17, 18, 07));
		SportsDTO sport162 = new SportsDTO("FootBall", "Livingston Mercer", 26, 9, "Oasis Stadium", "Bachelor Degree",
				"1983-07-10", 42193, LocalDate.of(2013, 03, 27), LocalTime.of(15, 46, 33));
		SportsDTO sport163 = new SportsDTO("Cricket", "Nellie Doyle", 32, 10, "Croom Stadium", "Master s Degree",
				"1989-09-04", 54483, LocalDate.of(2018, 9, 9), LocalTime.of(15, 35, 20));
		SportsDTO sport164 = new SportsDTO("BasketBall", "Tamera Hatfield", 28, 9, "Snyderville Stadium",
				"Master s Degree", "1994-05-29", 77466, LocalDate.of(2019, 8, 16), LocalTime.of(07, 00, 25));
		SportsDTO sport165 = new SportsDTO("FootBall", "Cooley Payne", 35, 9, "Joes Stadium", "Bachelor Degree",
				"2003-02-01", 65727, LocalDate.of(2023, 06, 03), LocalTime.of(9, 51, 20));
		SportsDTO sport166 = new SportsDTO("FootBall", "Gwen Peterson", 34, 11, "Layhill Stadium", "Associate s Degree",
				"2002-02-25", 76890, LocalDate.of(2022, 02, 23), LocalTime.of(8, 38, 12));
		SportsDTO sport167 = new SportsDTO("BasketBall", "Gay Hanson", 26, 11, "Takilma Stadium", "Bachelor Degree",
				"1990-01-28", 53852, LocalDate.of(2010, 8, 23), LocalTime.of(22, 06, 02));
		SportsDTO sport168 = new SportsDTO("Cricket", "Villarreal Ramos", 35, 5, "Gerton Stadium", "Associate s Degree",
				"1989-08-31", 77884, LocalDate.of(2017, 04, 15), LocalTime.of(23, 28, 58));
		SportsDTO sport169 = new SportsDTO("BasketBall", "Roberts Hall", 34, 9, "Brutus Stadium", "Bachelor Degree",
				"1991-11-11", 67055, LocalDate.of(2010, 11, 02), LocalTime.of(05, 14, 49));
		SportsDTO sport170 = new SportsDTO("FootBall", "Joan Maxwell", 30, 5, "Smeltertown Stadium", "Bachelor Degree",
				"2001-01-23", 66024, LocalDate.of(2018, 01, 9), LocalTime.of(14, 21, 34));
		SportsDTO sport171 = new SportsDTO("Cricket", "Patrick Donaldson", 23, 11, "Harmon Stadium", "Bachelor Degree",
				"1998-03-12", 55762, LocalDate.of(2015, 05, 19), LocalTime.of(14, 57, 31));
		SportsDTO sport172 = new SportsDTO("FootBall", "Lillie Steele", 24, 8, "Caroline Stadium", "High School",
				"1987-08-24", 65379, LocalDate.of(2016, 07, 21), LocalTime.of(17, 27, 34));
		SportsDTO sport173 = new SportsDTO("Cricket", "Grace Zamora", 27, 9, "Grill Stadium", "Master s Degree",
				"1985-10-01", 45099, LocalDate.of(2014, 8, 25), LocalTime.of(21, 43, 58));
		SportsDTO sport174 = new SportsDTO("BasketBall", "Brewer Farmer", 23, 5, "Fairlee Stadium", "Bachelor Degree",
				"1995-07-26", 55054, LocalDate.of(2010, 12, 11), LocalTime.of(06, 21, 55));
		SportsDTO sport175 = new SportsDTO("Cricket", "Franks Cooley", 25, 7, "Gloucester Stadium", "Master s Degree",
				"1997-05-26", 66046, LocalDate.of(2019, 12, 03), LocalTime.of(01, 35, 16));
		SportsDTO sport176 = new SportsDTO("Cricket", "Frances Cohen", 22, 5, "Nogal Stadium", "Master s Degree",
				"1984-04-27", 51216, LocalDate.of(2014, 12, 26), LocalTime.of(07, 13, 20));
		SportsDTO sport177 = new SportsDTO("FootBall", "Clemons Spence", 22, 8, "Leola Stadium", "Master s Degree",
				"1991-09-18", 50865, LocalDate.of(2012, 05, 15), LocalTime.of(00, 38, 28));
		SportsDTO sport178 = new SportsDTO("FootBall", "Elena Gilliam", 30, 10, "Cuylerville Stadium",
				"Bachelor Degree", "1995-02-04", 45940, LocalDate.of(2022, 06, 21), LocalTime.of(15, 25, 40));
		SportsDTO sport179 = new SportsDTO("FootBall", "Maynard Strickland", 21, 11, "Glidden Stadium",
				"Bachelor Degree", "1991-06-05", 47344, LocalDate.of(2015, 02, 07), LocalTime.of(10, 37, 06));
		SportsDTO sport180 = new SportsDTO("FootBall", "Janie Anderson", 23, 7, "Gwynn Stadium", "High School",
				"1992-02-09", 65150, LocalDate.of(2020, 07, 9), LocalTime.of(19, 12, 48));
		SportsDTO sport181 = new SportsDTO("BasketBall", "Burton Bartlett", 22, 6, "Deputy Stadium", "High School",
				"1981-11-19", 50729, LocalDate.of(2014, 07, 13), LocalTime.of(06, 50, 55));
		SportsDTO sport182 = new SportsDTO("FootBall", "Julia Reynolds", 24, 5, "Wintersburg Stadium",
				"Master s Degree", "1990-06-29", 56179, LocalDate.of(2013, 12, 26), LocalTime.of(17, 45, 54));
		SportsDTO sport183 = new SportsDTO("Cricket", "Atkinson Montoya", 28, 6, "Charco Stadium", "Bachelor Degree",
				"1992-01-05", 69499, LocalDate.of(2018, 01, 04), LocalTime.of(8, 22, 39));
		SportsDTO sport184 = new SportsDTO("Cricket", "Ophelia Abbott", 31, 11, "Hayes Stadium", "High School",
				"1988-07-15", 69227, LocalDate.of(2016, 11, 07), LocalTime.of(20, 41, 51));
		SportsDTO sport185 = new SportsDTO("FootBall", "Fowler Moody", 24, 8, "Canterwood Stadium",
				"Associate s Degree", "1989-02-12", 52139, LocalDate.of(2013, 01, 13), LocalTime.of(23, 30, 16));
		SportsDTO sport186 = new SportsDTO("FootBall", "Abigail Perkins", 22, 10, "Churchill Stadium",
				"Bachelor Degree", "1993-12-21", 69115, LocalDate.of(2012, 04, 18), LocalTime.of(02, 55, 20));
		SportsDTO sport187 = new SportsDTO("Cricket", "Alyson Cannon", 21, 10, "Bowden Stadium", "High School",
				"2003-12-21", 72490, LocalDate.of(2012, 06, 23), LocalTime.of(17, 17, 46));
		SportsDTO sport188 = new SportsDTO("Cricket", "Conley Johnston", 25, 11, "Beaverdale Stadium",
				"Bachelor Degree", "1992-01-15", 50283, LocalDate.of(2019, 9, 01), LocalTime.of(8, 25, 28));
		SportsDTO sport189 = new SportsDTO("Cricket", "Aurora Frederick", 35, 8, "Calvary Stadium", "Master s Degree",
				"1986-02-20", 79772, LocalDate.of(2019, 06, 05), LocalTime.of(22, 48, 56));
		SportsDTO sport190 = new SportsDTO("BasketBall", "Mae Adkins", 25, 6, "Nord Stadium", "Bachelor Degree",
				"1993-02-17", 61754, LocalDate.of(2022, 10, 15), LocalTime.of(18, 00, 31));
		SportsDTO sport191 = new SportsDTO("BasketBall", "Adams Hyde", 33, 8, "Cassel Stadium", "High School",
				"2003-05-14", 74061, LocalDate.of(2013, 04, 07), LocalTime.of(06, 54, 9));
		SportsDTO sport192 = new SportsDTO("FootBall", "Ayala Farrell", 27, 10, "Blandburg Stadium",
				"Associate s Degree", "1992-12-18", 74004, LocalDate.of(2020, 06, 9), LocalTime.of(05, 03, 9));
		SportsDTO sport193 = new SportsDTO("Cricket", "Brock Hansen", 28, 10, "Beaulieu Stadium", "Bachelor Degree",
				"1988-03-30", 68824, LocalDate.of(2014, 05, 28), LocalTime.of(14, 38, 13));
		SportsDTO sport194 = new SportsDTO("FootBall", "Carr Clements", 30, 9, "Gardiner Stadium", "Associate s Degree",
				"1993-04-23", 52593, LocalDate.of(2021, 05, 20), LocalTime.of(05, 32, 43));
		SportsDTO sport195 = new SportsDTO("Cricket", "Carey Anthony", 33, 10, "Bordelonville Stadium",
				"Associate s Degree", "1995-07-13", 47184, LocalDate.of(2010, 9, 11), LocalTime.of(03, 39, 20));
		SportsDTO sport196 = new SportsDTO("FootBall", "Hayden Murray", 33, 9, "Johnsonburg Stadium",
				"Associate s Degree", "1984-03-09", 61563, LocalDate.of(2019, 03, 22), LocalTime.of(05, 22, 52));
		SportsDTO sport197 = new SportsDTO("BasketBall", "Erika Howell", 34, 8, "Hinsdale Stadium",
				"Associate s Degree", "1997-03-20", 42190, LocalDate.of(2013, 01, 30), LocalTime.of(11, 45, 53));
		SportsDTO sport198 = new SportsDTO("BasketBall", "Osborne Koch", 28, 9, "Winchester Stadium", "Bachelor Degree",
				"2003-11-13", 69508, LocalDate.of(2010, 10, 01), LocalTime.of(10, 14, 01));
		SportsDTO sport199 = new SportsDTO("Cricket", "Debbie Nicholson", 27, 7, "Coinjock Stadium", "Bachelor Degree",
				"1981-10-27", 55334, LocalDate.of(2017, 9, 17), LocalTime.of(17, 05, 55));
		SportsDTO sport200 = new SportsDTO("Cricket", "Jeannette Durham", 25, 6, "Yardville Stadium", "Master s Degree",
				"1983-05-09", 56050, LocalDate.of(2022, 12, 22), LocalTime.of(18, 45, 57));
		SportsDTO sport201 = new SportsDTO("BasketBall", "Lacey Finley", 32, 11, "Smock Stadium", "Associate s Degree",
				"1997-02-12", 67681, LocalDate.of(2019, 10, 31), LocalTime.of(20, 14, 21));
		SportsDTO sport202 = new SportsDTO("BasketBall", "Harrington Greene", 27, 8, "Ferney Stadium",
				"Associate s Degree", "1984-10-07", 40052, LocalDate.of(2013, 01, 17), LocalTime.of(8, 51, 36));
		SportsDTO sport203 = new SportsDTO("Cricket", "Gloria Peters", 27, 9, "Caberfae Stadium", "Master s Degree",
				"1980-06-15", 69945, LocalDate.of(2023, 10, 20), LocalTime.of(23, 46, 54));
		SportsDTO sport204 = new SportsDTO("Cricket", "Duncan Finch", 31, 10, "Independence Stadium",
				"Associate s Degree", "1994-11-15", 76892, LocalDate.of(2015, 01, 19), LocalTime.of(11, 00, 59));
		SportsDTO sport205 = new SportsDTO("FootBall", "Frank Delacruz", 26, 8, "Elwood Stadium", "Master s Degree",
				"1985-09-28", 68655, LocalDate.of(2017, 04, 9), LocalTime.of(17, 49, 57));
		SportsDTO sport206 = new SportsDTO("Cricket", "Jodie Stein", 25, 5, "Derwood Stadium", "Master s Degree",
				"1997-11-05", 69478, LocalDate.of(2022, 8, 30), LocalTime.of(05, 44, 03));
		SportsDTO sport207 = new SportsDTO("BasketBall", "Hunt Villarreal", 35, 9, "Lutsen Stadium", "Bachelor Degree",
				"1997-05-23", 62310, LocalDate.of(2014, 9, 9), LocalTime.of(07, 00, 37));
		SportsDTO sport208 = new SportsDTO("FootBall", "Howell Booker", 32, 9, "Cleary Stadium", "High School",
				"2001-11-25", 79708, LocalDate.of(2014, 07, 8), LocalTime.of(01, 17, 10));
		SportsDTO sport209 = new SportsDTO("BasketBall", "Hunter Morris", 35, 9, "Goochland Stadium",
				"Associate s Degree", "1991-02-24", 42358, LocalDate.of(2018, 05, 21), LocalTime.of(11, 17, 12));
		SportsDTO sport210 = new SportsDTO("FootBall", "Michael Baldwin", 34, 10, "Hoehne Stadium", "Master s Degree",
				"1990-04-23", 53452, LocalDate.of(2014, 05, 9), LocalTime.of(15, 23, 44));
		SportsDTO sport211 = new SportsDTO("Cricket", "Alvarado Greer", 31, 7, "Juntura Stadium", "Bachelor Degree",
				"1984-07-19", 51790, LocalDate.of(2010, 8, 23), LocalTime.of(19, 13, 14));
		SportsDTO sport212 = new SportsDTO("Cricket", "Rosanne Justice", 27, 6, "Guilford Stadium", "High School",
				"1994-04-25", 46046, LocalDate.of(2020, 10, 02), LocalTime.of(8, 59, 03));
		SportsDTO sport213 = new SportsDTO("BasketBall", "Armstrong Shepherd", 26, 9, "Kieler Stadium",
				"Associate s Degree", "1986-04-05", 45740, LocalDate.of(2018, 04, 30), LocalTime.of(02, 9, 01));
		SportsDTO sport214 = new SportsDTO("BasketBall", "Dawson Stanton", 23, 10, "Shasta Stadium", "Master s Degree",
				"2003-04-09", 57216, LocalDate.of(2010, 06, 10), LocalTime.of(07, 38, 21));
		SportsDTO sport215 = new SportsDTO("BasketBall", "Melendez Reed", 21, 10, "Emison Stadium", "Bachelor Degree",
				"1992-09-06", 67714, LocalDate.of(2021, 04, 18), LocalTime.of(01, 16, 54));
		SportsDTO sport216 = new SportsDTO("BasketBall", "Sasha Chapman", 34, 9, "Shaft Stadium", "High School",
				"1992-09-13", 66592, LocalDate.of(2010, 07, 17), LocalTime.of(11, 58, 28));
		SportsDTO sport217 = new SportsDTO("Cricket", "Lindsey Matthews", 23, 10, "Gracey Stadium", "Master s Degree",
				"1983-08-22", 54258, LocalDate.of(2019, 04, 23), LocalTime.of(21, 19, 33));
		SportsDTO sport218 = new SportsDTO("Cricket", "Dunn Guzman", 28, 10, "Cedarville Stadium", "Bachelor Degree",
				"1986-07-14", 44499, LocalDate.of(2014, 07, 31), LocalTime.of(01, 21, 53));
		SportsDTO sport219 = new SportsDTO("Cricket", "Liza Barron", 25, 9, "Brogan Stadium", "Associate s Degree",
				"1988-03-29", 48215, LocalDate.of(2016, 12, 21), LocalTime.of(8, 54, 25));
		SportsDTO sport220 = new SportsDTO("Cricket", "Colon Barry", 21, 8, "Ahwahnee Stadium", "Associate s Degree",
				"1989-01-21", 69142, LocalDate.of(2018, 04, 29), LocalTime.of(02, 49, 54));
		SportsDTO sport221 = new SportsDTO("BasketBall", "Morton Sexton", 31, 7, "Libertytown Stadium", "High School",
				"1988-01-08", 78270, LocalDate.of(2013, 11, 07), LocalTime.of(06, 43, 20));
		SportsDTO sport222 = new SportsDTO("FootBall", "Enid Mccullough", 31, 11, "Choctaw Stadium", "Bachelor Degree",
				"1990-12-23", 70753, LocalDate.of(2021, 06, 29), LocalTime.of(02, 17, 48));
		SportsDTO sport223 = new SportsDTO("FootBall", "Dee Juarez", 25, 10, "Wedgewood Stadium", "Associate s Degree",
				"2000-12-17", 56560, LocalDate.of(2017, 02, 15), LocalTime.of(9, 05, 54));
		SportsDTO sport224 = new SportsDTO("BasketBall", "Mariana Sparks", 23, 9, "Lacomb Stadium", "Bachelor Degree",
				"1986-09-08", 57485, LocalDate.of(2018, 10, 31), LocalTime.of(14, 55, 07));
		SportsDTO sport225 = new SportsDTO("FootBall", "Williams Butler", 23, 7, "Herlong Stadium", "High School",
				"1984-04-28", 58628, LocalDate.of(2020, 9, 24), LocalTime.of(17, 04, 12));
		SportsDTO sport226 = new SportsDTO("BasketBall", "Rose Crosby", 35, 8, "Abrams Stadium", "Bachelor Degree",
				"1987-11-22", 59841, LocalDate.of(2018, 04, 06), LocalTime.of(00, 20, 59));
		SportsDTO sport227 = new SportsDTO("Cricket", "Isabelle Boyd", 23, 10, "Ezel Stadium", "Bachelor Degree",
				"1992-10-18", 46821, LocalDate.of(2011, 06, 30), LocalTime.of(17, 58, 20));
		SportsDTO sport228 = new SportsDTO("Cricket", "Hester Carroll", 30, 5, "Cade Stadium", "Master s Degree",
				"1999-12-25", 62517, LocalDate.of(2013, 05, 25), LocalTime.of(03, 05, 54));
		SportsDTO sport229 = new SportsDTO("BasketBall", "Lenore Black", 30, 9, "Haena Stadium", "Associate s Degree",
				"1980-12-01", 76243, LocalDate.of(2012, 8, 03), LocalTime.of(02, 17, 47));
		SportsDTO sport230 = new SportsDTO("FootBall", "Malinda Moses", 22, 9, "Datil Stadium", "Associate s Degree",
				"1998-06-17", 47985, LocalDate.of(2019, 07, 03), LocalTime.of(11, 26, 53));
		SportsDTO sport231 = new SportsDTO("Cricket", "Saunders Olson", 34, 11, "Morningside Stadium",
				"Associate s Degree", "1994-07-05", 76041, LocalDate.of(2014, 01, 8), LocalTime.of(9, 44, 56));
		SportsDTO sport232 = new SportsDTO("BasketBall", "Padilla Howard", 22, 6, "Hondah Stadium", "Master s Degree",
				"1984-09-04", 58169, LocalDate.of(2017, 02, 9), LocalTime.of(00, 07, 00));
		SportsDTO sport233 = new SportsDTO("BasketBall", "Cantrell Vazquez", 35, 7, "Sperryville Stadium",
				"Bachelor Degree", "1992-09-04", 40518, LocalDate.of(2017, 11, 14), LocalTime.of(20, 49, 00));
		SportsDTO sport234 = new SportsDTO("Cricket", "Sandra Moran", 34, 8, "Kenmar Stadium", "Associate s Degree",
				"1980-04-30", 63146, LocalDate.of(2012, 12, 24), LocalTime.of(14, 44, 38));
		SportsDTO sport235 = new SportsDTO("FootBall", "Velasquez Foster", 30, 10, "Titanic Stadium", "High School",
				"1999-08-30", 73869, LocalDate.of(2019, 03, 04), LocalTime.of(22, 57, 35));
		SportsDTO sport236 = new SportsDTO("BasketBall", "Kidd Marks", 22, 8, "Linwood Stadium", "High School",
				"1990-02-01", 57708, LocalDate.of(2020, 11, 12), LocalTime.of(17, 40, 59));
		SportsDTO sport237 = new SportsDTO("FootBall", "Casandra Kinney", 24, 9, "Templeton Stadium", "Master s Degree",
				"1985-03-31", 59608, LocalDate.of(2020, 02, 05), LocalTime.of(22, 20, 42));
		SportsDTO sport238 = new SportsDTO("BasketBall", "Tillman Williams", 24, 11, "Moquino Stadium",
				"Master s Degree", "1989-08-09", 47036, LocalDate.of(2011, 02, 28), LocalTime.of(10, 23, 33));
		SportsDTO sport239 = new SportsDTO("Cricket", "Pamela Estrada", 27, 6, "Roy Stadium", "Master s Degree",
				"1984-02-25", 69051, LocalDate.of(2014, 07, 21), LocalTime.of(06, 24, 53));
		SportsDTO sport240 = new SportsDTO("BasketBall", "Nielsen Buck", 27, 10, "Stewart Stadium",
				"Associate s Degree", "1986-01-16", 42919, LocalDate.of(2021, 12, 14), LocalTime.of(03, 46, 02));
		SportsDTO sport241 = new SportsDTO("Cricket", "Elisa Wade", 28, 10, "Nutrioso Stadium", "Master s Degree",
				"2003-03-10", 42960, LocalDate.of(2018, 02, 19), LocalTime.of(12, 06, 25));
		SportsDTO sport242 = new SportsDTO("Cricket", "Scott Hancock", 33, 5, "Coldiron Stadium", "High School",
				"2000-06-21", 63648, LocalDate.of(2022, 05, 18), LocalTime.of(17, 16, 01));
		SportsDTO sport243 = new SportsDTO("BasketBall", "Charlotte Willis", 22, 6, "Southmont Stadium",
				"Associate s Degree", "1984-11-12", 53734, LocalDate.of(2017, 9, 28), LocalTime.of(12, 15, 06));
		SportsDTO sport244 = new SportsDTO("FootBall", "Tessa Cotton", 27, 10, "Homeland Stadium", "Master s Degree",
				"2002-01-22", 44532, LocalDate.of(2014, 04, 25), LocalTime.of(23, 34, 38));
		SportsDTO sport245 = new SportsDTO("FootBall", "Jerri Dodson", 20, 11, "Bison Stadium", "Master s Degree",
				"1994-11-14", 74067, LocalDate.of(2023, 11, 20), LocalTime.of(13, 52, 24));
		SportsDTO sport246 = new SportsDTO("FootBall", "Laverne Duncan", 27, 8, "Chloride Stadium",
				"Associate s Degree", "2001-06-29", 51577, LocalDate.of(2011, 11, 22), LocalTime.of(02, 8, 45));
		SportsDTO sport247 = new SportsDTO("Cricket", "Dana Snow", 27, 6, "Spokane Stadium", "Associate s Degree",
				"1983-03-07", 67776, LocalDate.of(2013, 11, 01), LocalTime.of(13, 59, 44));
		SportsDTO sport248 = new SportsDTO("FootBall", "Mallory Logan", 25, 11, "Cressey Stadium", "High School",
				"1982-01-03", 63219, LocalDate.of(2015, 9, 11), LocalTime.of(03, 12, 26));
		SportsDTO sport249 = new SportsDTO("Cricket", "Savage King", 34, 6, "Gorham Stadium", "Associate s Degree",
				"2001-03-20", 51099, LocalDate.of(2022, 11, 02), LocalTime.of(06, 48, 21));
		SportsDTO sport250 = new SportsDTO("Cricket", "Dudley Gomez", 22, 5, "Roosevelt Stadium", "Master s Degree",
				"1989-08-04", 75558, LocalDate.of(2023, 8, 14), LocalTime.of(22, 42, 04));
		SportsDTO sport251 = new SportsDTO("BasketBall", "Davis Crane", 25, 7, "Gallina Stadium", "High School",
				"1997-08-26", 79630, LocalDate.of(2015, 11, 29), LocalTime.of(07, 24, 31));
		SportsDTO sport252 = new SportsDTO("Cricket", "Megan Albert", 24, 9, "Roland Stadium", "High School",
				"1982-07-28", 60497, LocalDate.of(2013, 04, 21), LocalTime.of(12, 06, 56));
		SportsDTO sport253 = new SportsDTO("BasketBall", "Hays Hart", 24, 10, "Lowgap Stadium", "High School",
				"2000-11-04", 66068, LocalDate.of(2014, 07, 21), LocalTime.of(00, 46, 17));
		SportsDTO sport254 = new SportsDTO("Cricket", "Mercer Sullivan", 27, 10, "Santel Stadium", "Associate s Degree",
				"1980-10-22", 70938, LocalDate.of(2016, 03, 22), LocalTime.of(02, 18, 36));
		SportsDTO sport255 = new SportsDTO("BasketBall", "Carpenter Guerrero", 33, 7, "Winston Stadium", "High School",
				"1994-09-12", 48719, LocalDate.of(2014, 07, 24), LocalTime.of(11, 9, 52));
		SportsDTO sport256 = new SportsDTO("Cricket", "Shaw Luna", 34, 11, "Keyport Stadium", "Master s Degree",
				"1980-06-12", 66709, LocalDate.of(2022, 05, 29), LocalTime.of(06, 32, 13));
		SportsDTO sport257 = new SportsDTO("FootBall", "Melanie Cantrell", 28, 5, "Roulette Stadium", "High School",
				"1994-01-20", 60954, LocalDate.of(2015, 01, 26), LocalTime.of(16, 22, 24));
		SportsDTO sport258 = new SportsDTO("Cricket", "Lina Gamble", 20, 11, "Cascades Stadium", "High School",
				"2001-05-31", 68599, LocalDate.of(2023, 06, 12), LocalTime.of(16, 05, 41));
		SportsDTO sport259 = new SportsDTO("BasketBall", "Nolan Baker", 35, 11, "Nash Stadium", "High School",
				"1981-09-21", 59588, LocalDate.of(2019, 01, 25), LocalTime.of(04, 40, 25));
		SportsDTO sport260 = new SportsDTO("FootBall", "Shana Lambert", 30, 6, "Chaparrito Stadium",
				"Associate s Degree", "1985-04-10", 57429, LocalDate.of(2022, 12, 14), LocalTime.of(18, 42, 37));
		SportsDTO sport261 = new SportsDTO("BasketBall", "John Hester", 32, 10, "Byrnedale Stadium", "Bachelor Degree",
				"1988-08-12", 77715, LocalDate.of(2013, 8, 24), LocalTime.of(10, 33, 9));
		SportsDTO sport262 = new SportsDTO("FootBall", "Elizabeth Maynard", 33, 6, "Montura Stadium",
				"Associate s Degree", "1981-11-08", 44253, LocalDate.of(2012, 11, 06), LocalTime.of(10, 46, 10));
		SportsDTO sport263 = new SportsDTO("Cricket", "Tania Eaton", 22, 10, "Hegins Stadium", "Master s Degree",
				"1997-08-16", 79002, LocalDate.of(2014, 01, 19), LocalTime.of(04, 33, 36));
		SportsDTO sport264 = new SportsDTO("Cricket", "Brandie Frank", 31, 11, "Deseret Stadium", "Master s Degree",
				"1983-08-18", 59591, LocalDate.of(2012, 9, 05), LocalTime.of(14, 30, 38));
		SportsDTO sport265 = new SportsDTO("FootBall", "Young Wooten", 26, 11, "Northridge Stadium", "High School",
				"1983-05-08", 42045, LocalDate.of(2012, 02, 8), LocalTime.of(20, 42, 37));
		SportsDTO sport266 = new SportsDTO("BasketBall", "Rosalie Nelson", 25, 7, "Juarez Stadium", "Master s Degree",
				"1996-03-09", 55733, LocalDate.of(2022, 05, 10), LocalTime.of(23, 11, 41));
		SportsDTO sport267 = new SportsDTO("BasketBall", "Nadine Johnson", 29, 9, "Loveland Stadium", "High School",
				"2003-07-28", 69912, LocalDate.of(2019, 11, 02), LocalTime.of(8, 25, 24));
		SportsDTO sport268 = new SportsDTO("FootBall", "Amalia Jimenez", 35, 6, "Blanco Stadium", "Bachelor Degree",
				"1983-08-30", 74753, LocalDate.of(2021, 01, 22), LocalTime.of(11, 22, 25));
		SportsDTO sport269 = new SportsDTO("Cricket", "Linda Burns", 24, 11, "Brownlee Stadium", "Bachelor Degree",
				"2000-08-24", 42278, LocalDate.of(2016, 05, 23), LocalTime.of(10, 12, 41));
		SportsDTO sport270 = new SportsDTO("Cricket", "Esmeralda Reese", 32, 7, "Aurora Stadium", "Associate s Degree",
				"1985-07-26", 72641, LocalDate.of(2015, 03, 01), LocalTime.of(03, 52, 27));
		SportsDTO sport271 = new SportsDTO("FootBall", "Liz Swanson", 26, 8, "Russellville Stadium",
				"Associate s Degree", "1980-01-10", 57266, LocalDate.of(2017, 8, 22), LocalTime.of(20, 47, 14));
		SportsDTO sport272 = new SportsDTO("Cricket", "Jamie Gutierrez", 35, 8, "Elliott Stadium", "Master s Degree",
				"2003-06-29", 79051, LocalDate.of(2017, 12, 15), LocalTime.of(12, 15, 58));
		SportsDTO sport273 = new SportsDTO("Cricket", "Georgette Salazar", 34, 10, "Cotopaxi Stadium", "High School",
				"1990-12-07", 64228, LocalDate.of(2019, 02, 23), LocalTime.of(17, 51, 18));
		SportsDTO sport274 = new SportsDTO("FootBall", "Shannon Owens", 29, 9, "Riverton Stadium", "Associate s Degree",
				"1996-05-16", 69223, LocalDate.of(2014, 01, 25), LocalTime.of(19, 10, 21));
		SportsDTO sport275 = new SportsDTO("Cricket", "Angelique Neal", 25, 11, "Enlow Stadium", "Associate s Degree",
				"2001-07-02", 56690, LocalDate.of(2019, 11, 24), LocalTime.of(06, 32, 31));
		SportsDTO sport276 = new SportsDTO("Cricket", "Robert Hunt", 34, 10, "Sidman Stadium", "Master s Degree",
				"1980-01-05", 61236, LocalDate.of(2023, 03, 14), LocalTime.of(03, 31, 44));
		SportsDTO sport277 = new SportsDTO("BasketBall", "Allison Chang", 23, 10, "Bridgetown Stadium",
				"Master s Degree", "1987-05-26", 60801, LocalDate.of(2022, 03, 11), LocalTime.of(15, 42, 36));
		SportsDTO sport278 = new SportsDTO("Cricket", "Rosanna Rios", 29, 8, "Westerville Stadium",
				"Associate s Degree", "1991-07-07", 40804, LocalDate.of(2022, 10, 18), LocalTime.of(12, 18, 12));
		SportsDTO sport279 = new SportsDTO("Cricket", "Wall Fuentes", 30, 6, "Dawn Stadium", "High School",
				"1989-04-16", 59235, LocalDate.of(2019, 8, 31), LocalTime.of(9, 04, 55));
		SportsDTO sport280 = new SportsDTO("BasketBall", "Mia Sawyer", 23, 10, "Chilton Stadium", "Associate s Degree",
				"1983-09-18", 77064, LocalDate.of(2010, 10, 8), LocalTime.of(11, 13, 40));
		SportsDTO sport281 = new SportsDTO("FootBall", "Avery Ortega", 23, 6, "Boykin Stadium", "Bachelor Degree",
				"2002-11-20", 70923, LocalDate.of(2013, 04, 8), LocalTime.of(20, 40, 43));
		SportsDTO sport282 = new SportsDTO("BasketBall", "Schroeder Aguilar", 30, 6, "Tampico Stadium",
				"Bachelor Degree", "1997-12-07", 60589, LocalDate.of(2011, 12, 06), LocalTime.of(23, 54, 57));
		SportsDTO sport283 = new SportsDTO("Cricket", "Rae Wilkerson", 34, 10, "Ruffin Stadium", "Bachelor Degree",
				"1993-11-15", 59808, LocalDate.of(2018, 03, 06), LocalTime.of(06, 47, 11));
		SportsDTO sport284 = new SportsDTO("Cricket", "Powers Branch", 28, 7, "Grazierville Stadium",
				"Associate s Degree", "1993-07-04", 59296, LocalDate.of(2011, 06, 13), LocalTime.of(21, 9, 52));
		SportsDTO sport285 = new SportsDTO("FootBall", "William Cervantes", 27, 10, "Galesville Stadium",
				"Associate s Degree", "1996-10-27", 69334, LocalDate.of(2012, 02, 29), LocalTime.of(9, 40, 18));
		SportsDTO sport286 = new SportsDTO("BasketBall", "Tommie Knight", 35, 5, "Drytown Stadium", "Master s Degree",
				"1987-08-14", 43594, LocalDate.of(2011, 04, 28), LocalTime.of(23, 35, 56));
		SportsDTO sport287 = new SportsDTO("FootBall", "Hurst Bentley", 24, 8, "Whitewater Stadium", "High School",
				"1981-05-17", 56470, LocalDate.of(2012, 06, 07), LocalTime.of(04, 32, 8));
		SportsDTO sport288 = new SportsDTO("Cricket", "Ella Thomas", 24, 11, "Harviell Stadium", "Master s Degree",
				"1996-09-15", 41537, LocalDate.of(2013, 9, 02), LocalTime.of(04, 13, 15));
		SportsDTO sport289 = new SportsDTO("Cricket", "Ila Boyle", 33, 7, "Blairstown Stadium", "High School",
				"2002-07-05", 78473, LocalDate.of(2016, 01, 11), LocalTime.of(05, 05, 33));
		SportsDTO sport290 = new SportsDTO("FootBall", "Berta Chen", 35, 11, "Maplewood Stadium", "Associate s Degree",
				"1987-04-29", 47860, LocalDate.of(2022, 12, 25), LocalTime.of(23, 52, 50));
		SportsDTO sport291 = new SportsDTO("BasketBall", "Miriam Jensen", 24, 8, "Farmers Stadium",
				"Associate s Degree", "2003-05-08", 44721, LocalDate.of(2022, 04, 21), LocalTime.of(16, 10, 37));
		SportsDTO sport292 = new SportsDTO("FootBall", "Terra Gonzalez", 29, 9, "Siglerville Stadium",
				"Master s Degree", "1980-07-18", 73799, LocalDate.of(2023, 8, 30), LocalTime.of(00, 23, 55));
		SportsDTO sport293 = new SportsDTO("BasketBall", "Mayer Caldwell", 24, 9, "Tedrow Stadium",
				"Associate s Degree", "1980-09-09", 50263, LocalDate.of(2012, 9, 18), LocalTime.of(06, 17, 49));
		SportsDTO sport294 = new SportsDTO("BasketBall", "Beulah Waters", 35, 9, "Edneyville Stadium",
				"Associate s Degree", "1988-08-01", 71971, LocalDate.of(2019, 8, 06), LocalTime.of(02, 20, 50));
		SportsDTO sport295 = new SportsDTO("FootBall", "Denise Merritt", 30, 9, "Forestburg Stadium", "Bachelor Degree",
				"1992-06-14", 54829, LocalDate.of(2023, 12, 16), LocalTime.of(06, 05, 23));
		SportsDTO sport296 = new SportsDTO("FootBall", "Terrie Walter", 24, 5, "Sena Stadium", "High School",
				"2001-02-12", 69496, LocalDate.of(2022, 11, 07), LocalTime.of(00, 8, 33));
		SportsDTO sport297 = new SportsDTO("BasketBall", "Norton Waller", 22, 7, "Bagtown Stadium", "Bachelor Degree",
				"2000-08-25", 67994, LocalDate.of(2014, 03, 19), LocalTime.of(20, 00, 04));
		SportsDTO sport298 = new SportsDTO("BasketBall", "Porter Marshall", 27, 10, "Matheny Stadium",
				"Associate s Degree", "2000-04-04", 75142, LocalDate.of(2023, 01, 28), LocalTime.of(23, 20, 51));
		SportsDTO sport299 = new SportsDTO("FootBall", "Ilene Monroe", 33, 11, "Lupton Stadium", "Bachelor Degree",
				"1991-09-18", 55437, LocalDate.of(2012, 01, 02), LocalTime.of(23, 31, 45));
		SportsDTO sport300 = new SportsDTO("FootBall", "Weeks Key", 21, 9, "Bainbridge Stadium", "Associate s Degree",
				"1991-10-17", 41643, LocalDate.of(2017, 01, 21), LocalTime.of(17, 43, 15));

		Collection<SportsDTO> games = new ArrayList<SportsDTO>();

		games.add(sport1);
		games.add(sport2);
		games.add(sport3);
		games.add(sport4);
		games.add(sport5);
		games.add(sport6);
		games.add(sport7);
		games.add(sport8);
		games.add(sport9);
		games.add(sport10);
		games.add(sport11);
		games.add(sport12);
		games.add(sport13);
		games.add(sport14);
		games.add(sport15);
		games.add(sport16);
		games.add(sport17);
		games.add(sport18);
		games.add(sport19);
		games.add(sport20);
		games.add(sport21);
		games.add(sport22);
		games.add(sport23);
		games.add(sport24);
		games.add(sport25);
		games.add(sport26);
		games.add(sport27);
		games.add(sport28);
		games.add(sport29);
		games.add(sport30);
		games.add(sport31);
		games.add(sport32);
		games.add(sport33);
		games.add(sport34);
		games.add(sport35);
		games.add(sport36);
		games.add(sport37);
		games.add(sport38);
		games.add(sport39);
		games.add(sport40);
		games.add(sport41);
		games.add(sport42);
		games.add(sport43);
		games.add(sport44);
		games.add(sport45);
		games.add(sport46);
		games.add(sport47);
		games.add(sport48);
		games.add(sport49);
		games.add(sport50);
		games.add(sport51);
		games.add(sport52);
		games.add(sport53);
		games.add(sport54);
		games.add(sport55);
		games.add(sport56);
		games.add(sport57);
		games.add(sport58);
		games.add(sport59);
		games.add(sport60);
		games.add(sport61);
		games.add(sport62);
		games.add(sport63);
		games.add(sport64);
		games.add(sport65);
		games.add(sport66);
		games.add(sport67);
		games.add(sport68);
		games.add(sport69);
		games.add(sport70);
		games.add(sport71);
		games.add(sport72);
		games.add(sport73);
		games.add(sport74);
		games.add(sport75);
		games.add(sport76);
		games.add(sport77);
		games.add(sport78);
		games.add(sport79);
		games.add(sport80);
		games.add(sport81);
		games.add(sport82);
		games.add(sport83);
		games.add(sport84);
		games.add(sport85);
		games.add(sport86);
		games.add(sport87);
		games.add(sport88);
		games.add(sport89);
		games.add(sport90);
		games.add(sport91);
		games.add(sport92);
		games.add(sport93);
		games.add(sport94);
		games.add(sport95);
		games.add(sport96);
		games.add(sport97);
		games.add(sport98);
		games.add(sport99);
		games.add(sport100);
		games.add(sport101);
		games.add(sport102);
		games.add(sport103);
		games.add(sport104);
		games.add(sport105);
		games.add(sport106);
		games.add(sport107);
		games.add(sport108);
		games.add(sport109);
		games.add(sport110);
		games.add(sport111);
		games.add(sport112);
		games.add(sport113);
		games.add(sport114);
		games.add(sport115);
		games.add(sport116);
		games.add(sport117);
		games.add(sport118);
		games.add(sport119);
		games.add(sport120);
		games.add(sport121);
		games.add(sport122);
		games.add(sport123);
		games.add(sport124);
		games.add(sport125);
		games.add(sport126);
		games.add(sport127);
		games.add(sport128);
		games.add(sport129);
		games.add(sport130);
		games.add(sport131);
		games.add(sport132);
		games.add(sport133);
		games.add(sport134);
		games.add(sport135);
		games.add(sport136);
		games.add(sport137);
		games.add(sport138);
		games.add(sport139);
		games.add(sport140);
		games.add(sport141);
		games.add(sport142);
		games.add(sport143);
		games.add(sport144);
		games.add(sport145);
		games.add(sport146);
		games.add(sport147);
		games.add(sport148);
		games.add(sport149);
		games.add(sport150);
		games.add(sport151);
		games.add(sport152);
		games.add(sport153);
		games.add(sport154);
		games.add(sport155);
		games.add(sport156);
		games.add(sport157);
		games.add(sport158);
		games.add(sport159);
		games.add(sport160);
		games.add(sport161);
		games.add(sport162);
		games.add(sport163);
		games.add(sport164);
		games.add(sport165);
		games.add(sport166);
		games.add(sport167);
		games.add(sport168);
		games.add(sport169);
		games.add(sport170);
		games.add(sport171);
		games.add(sport172);
		games.add(sport173);
		games.add(sport174);
		games.add(sport175);
		games.add(sport176);
		games.add(sport177);
		games.add(sport178);
		games.add(sport179);
		games.add(sport180);
		games.add(sport181);
		games.add(sport182);
		games.add(sport183);
		games.add(sport184);
		games.add(sport185);
		games.add(sport186);
		games.add(sport187);
		games.add(sport188);
		games.add(sport189);
		games.add(sport190);
		games.add(sport191);
		games.add(sport192);
		games.add(sport193);
		games.add(sport194);
		games.add(sport195);
		games.add(sport196);
		games.add(sport197);
		games.add(sport198);
		games.add(sport199);
		games.add(sport200);
		games.add(sport201);
		games.add(sport202);
		games.add(sport203);
		games.add(sport204);
		games.add(sport205);
		games.add(sport206);
		games.add(sport207);
		games.add(sport208);
		games.add(sport209);
		games.add(sport210);
		games.add(sport211);
		games.add(sport212);
		games.add(sport213);
		games.add(sport214);
		games.add(sport215);
		games.add(sport216);
		games.add(sport217);
		games.add(sport218);
		games.add(sport219);
		games.add(sport220);
		games.add(sport221);
		games.add(sport222);
		games.add(sport223);
		games.add(sport224);
		games.add(sport225);
		games.add(sport226);
		games.add(sport227);
		games.add(sport228);
		games.add(sport229);
		games.add(sport230);
		games.add(sport231);
		games.add(sport232);
		games.add(sport233);
		games.add(sport234);
		games.add(sport235);
		games.add(sport236);
		games.add(sport237);
		games.add(sport238);
		games.add(sport239);
		games.add(sport240);
		games.add(sport241);
		games.add(sport242);
		games.add(sport243);
		games.add(sport244);
		games.add(sport245);
		games.add(sport246);
		games.add(sport247);
		games.add(sport248);
		games.add(sport249);
		games.add(sport250);
		games.add(sport251);
		games.add(sport252);
		games.add(sport253);
		games.add(sport254);
		games.add(sport255);
		games.add(sport256);
		games.add(sport257);
		games.add(sport258);
		games.add(sport259);
		games.add(sport260);
		games.add(sport261);
		games.add(sport262);
		games.add(sport263);
		games.add(sport264);
		games.add(sport265);
		games.add(sport266);
		games.add(sport267);
		games.add(sport268);
		games.add(sport269);
		games.add(sport270);
		games.add(sport271);
		games.add(sport272);
		games.add(sport273);
		games.add(sport274);
		games.add(sport275);
		games.add(sport276);
		games.add(sport277);
		games.add(sport278);
		games.add(sport279);
		games.add(sport280);
		games.add(sport281);
		games.add(sport282);
		games.add(sport283);
		games.add(sport284);
		games.add(sport285);
		games.add(sport286);
		games.add(sport287);
		games.add(sport288);
		games.add(sport289);
		games.add(sport290);
		games.add(sport291);
		games.add(sport292);
		games.add(sport293);
		games.add(sport294);
		games.add(sport295);
		games.add(sport296);
		games.add(sport297);
		games.add(sport298);
		games.add(sport299);
		games.add(sport300);
		for (SportsDTO sportsDTO : games) {
			System.out.println(sportsDTO);
		}
		SportsDTO sportTest = new SportsDTO("FootBall", "Laverne Duncan", 27, 8, "Chloride Stadium",
				"Associate s Degree", "2001-06-29", 51577, LocalDate.of(2011, 11, 22), LocalTime.of(02, 8, 45));
		SportsDTO sportTest1 = new SportsDTO("FootBall", "Melva Cote", 33, 8, "Jennings Stadium", "Bachelor Degree",
				"1999-07-13", 70668, LocalDate.of(2021, 07, 19), LocalTime.of(15, 35, 14));
		Collection<SportsDTO> test = new ArrayList<SportsDTO>();
		test.add(sportTest);
		test.add(sportTest1);
		System.out.println("contains:" + games.contains(sportTest));
		System.out.println("contains all:" + games.containsAll(test));
		System.out.println("remove:" + games.remove(sportTest1));
		System.out.println("remove all:" + games.removeAll(test));
	}
}

