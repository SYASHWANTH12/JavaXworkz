package com.xworkz.Fish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Camera {
	public static void main(String[] args) {
		Collection<CameraDTO> collection = new ArrayList<CameraDTO>();
		CameraDTO camera = new CameraDTO(1, "Neon", "1965", 15000, "2:07:2001");
		CameraDTO camera1 = new CameraDTO(2, "Canon", "1934", 25000, "2:04:2011");
		CameraDTO camera2 = new CameraDTO(3, "Kodak", "1936", 35000, "2:07:2021");
		CameraDTO camera3 = new CameraDTO(4, "Sony", "1969", 45000, "2:07:1987");
		CameraDTO camera4 = new CameraDTO(5, "Lenovo", "1989", 55000, "2:07:2000");
		collection.add(camera);
		collection.add(camera1);
		collection.add(camera2);
		collection.add(camera3);
		collection.add(camera4);
		Iterator<CameraDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			CameraDTO D = itr.next();
			System.out.println(D);
		}
		Collection<CameraDTO> collection1 = null ;
		System.out.println("----------------------------------------");
		collection.stream().filter(ref->ref.getBrand().equals("Kodak")).forEach(ref->System.out.println(ref));
		System.out.println("---------------------------------");
		collection.stream().filter(ref->ref.getCost()>40000);
		collection1.forEach(s->System.out.println(s));
		System.out.println("-----------------------------------------");
		collection1= collection
		 .stream()//5
		 .filter(ref->ref.getId()>3)//2 
.collect(Collectors.toList());
		 
		 
		 
	}
}

