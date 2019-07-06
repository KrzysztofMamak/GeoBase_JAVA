package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ProjectReader {
	public static List<Project> getProjects(String path) {
		File file = new File(path);
		List<Project> projects = new ArrayList<>();
		try {
			Scanner in = new Scanner(file);
			Project project;
			Point point;
			while (in.hasNextLine()) {
				project = new Project();
				project.setNumber(in.nextInt());
				in.nextLine();
				project.setTown(in.nextLine());
				project.setStreet(in.nextLine());
				project.setDescription(in.nextLine());
				int pointsAmount = in.nextInt();
				in.nextLine();
				for (int i = 0; i < pointsAmount; i++) {
					point = new Point();
					point.setName(in.next());
					point.setX(Double.parseDouble(in.next()));
					point.setY(Double.parseDouble(in.next()));
					in.nextLine();
					project.getPointList().add(point);
				}
				project.setMarked(in.nextBoolean());
				project.setMeasured(in.nextBoolean());
				project.setDone(in.nextBoolean());
				in.nextLine();
				project.setStartDate(in.nextLine());
				project.setMarkDate(in.nextLine());
				project.setMeasureDate(in.nextLine());
				project.setDoneDate(in.nextLine());
				projects.add(project);
			}
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return projects;
	}
}
