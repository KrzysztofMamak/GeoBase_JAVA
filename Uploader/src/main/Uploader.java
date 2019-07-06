package main;

import java.util.List;

public class Uploader {
	public static void main(String[] args) {
		List<Project> projects = ProjectReader
				.getProjects("...Format.txt");
		ProjectWriter.sendProjects(projects);	
	}
}
