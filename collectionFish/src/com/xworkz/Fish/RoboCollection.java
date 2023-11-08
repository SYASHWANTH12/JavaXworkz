package com.xworkz.Fish;

import java.util.ArrayList;
import java.util.Collection;

public class RoboCollection {
public static void main(String[] args) {
	RobotDTO dto=new RobotDTO(14000, "Alexa", "Shivamogga", true);
	RobotDTO dto1=new RobotDTO(13000, "Siri", "Bangalore", true);
	RobotDTO dto2=new RobotDTO(21000, "Google", "USA", true);
	RobotDTO dto3=new RobotDTO(17000, "Vinay", "China", true);
	RobotDTO dto4=new RobotDTO(19000, "Jeevan", "Malashiya", true);
	Collection<RobotDTO> collection=new ArrayList<RobotDTO>();
	collection.add(dto4);
	collection.add(dto3);
	collection.add(dto2);
	collection.add(dto1);
	collection.add(dto);
	collection.stream().sorted().forEach(ref->System.out.println(ref));
}
}





//list :It is collection of ordered Objects,It can Have duplicate value,The order of the elements are mattered
//set:it is unordered collection of objects,it can not have duplicate value,the order of the elements does not matter
//queue:it is collection of objects based on the principle of first in and first out means 

























