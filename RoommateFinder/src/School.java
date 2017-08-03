import java.util.*;


// @author Jeremiah
/**
 * This class houses the student objects at two levels: school and building.
 * The building class is found at the end, nested within the school class.
 */
public class School
{
	private String name;
	private List<Building> buildings;
	
	/**
	 * Buildings are stored in a list for the sake of chronological retrieval.
	 * @param name the name of the school
	 */
	public School(String name)
	{
		this.name = name;
		buildings = new ArrayList<Building>();
	}

	/**
	 * Checks if the school has a certain student in it.
	 * This works by iterating through all of the associated buildings to find a match.
	 * This method is O(n) by itself, but O(n^2) including the method it calls.
	 * It is not implemented at this point because we do not have a need for it yet.
	 * It can be implemented in the future if needed.
	 * @param student the student to be searched for
	 * @return true if the student exists in the school
	 */
	public boolean contains(Student student)
	{
		for(Building building : buildings) if(building.contains(student)) return true;
		return false;
	}

	/**
	 * Adds a building to the school by placing it in the list of buildings.
	 * @param building the building to be added
	 * @return true if the building is added successfully
	 */
	public boolean add(Building building){return buildings.add(building);}
	
	/**
	 * Adds a student to a specific building within the school, by building name.
	 * If the building is not within the school, an exception is thrown.
	 * @param student the student to add to the building
	 * @param building the building within the school
	 * @return true if the student is added successfully
	 */
	public boolean add(Student student, Building building)
	{
		if(!buildings.contains(building)) throw new IllegalArgumentException();
		student.setSchool(this);
		return building.add(student);
	}

	/**
	 * Adds a student to a building within the school, by building index.
	 * @param student the student to add to the building
	 * @param buildingIndex the index of the building within the school.
	 * @return true if the student is added successfully
	 */
	public boolean add(Student student, int buildingIndex)
	{
		if(buildings.get(buildingIndex) == null) throw new IllegalArgumentException();
		student.setSchool(this);
		return buildings.get(buildingIndex).add(student);
	}

	/**
	 * Adds a student to the school without choosing a building.
	 * The student will be added to the first building that is not full.
	 * @param student the student to be added
	 * @return true if the student is added successfully
	 */
	public boolean add(Student student)
	{
		for(Building building: buildings)
		{
			if(building.add(student))
			{
				student.setSchool(this);
				return true;
			}
		}
		return false;
	}

	/**
	 * Removes A student from the school.
	 * @param student the student to be removed
	 * @return true if the student is removed successfully
     */
	boolean remove(Student student)
	{
		for(Building building : buildings) if(building.remove(student)) return true;
		return false;
	}

	/**
	 * Gets the name of the school.
	 * @return the name of the school
     */
	public String getName() {return name;}

	/**
	 * Gets the set of all students in the school students
	 * @return a set of all students
     */
	Set<Student> getStudents()
	{
		Set<Student> students = new HashSet<Student>();
		for(Building building : buildings) students.addAll(building.getStudents());
		return students;
	}

	/**
	 * Class for creating a building.
	 */
	public static class Building
	{
		private String name;
		int capacity;
		private Set<Student> students;

		/**
		 * Creates the building with a name and total capacity.
		 * @param name the name of the building
		 * @param capacity the total capacity of the building
         */
		public Building(String name, int capacity)
		{
			this.name = name;
			this.capacity = capacity;
			students = new HashSet<Student>();
		}

		/**
		 * Adds a student to the specific building
		 * @param student the student
         * @return true if the student is successfully added
         */
		public boolean add(Student student)
		{
			if(students.size()+1 > capacity) return false;
			return students.add(student);
		}

		/**
		 * Gets the set of students within just this building.
		 * @return the set of students
         */
		Set<Student> getStudents(){return students;}

		/**
		 * Checks to see if a certain student is already in the building.
		 * @param student the student to be checked
         * @return true if the student is in the building
         */
		boolean contains(Student student) {return students.contains(student);}

		/**
		 * Removes a specific student from a building.
		 * @param student the student to be removed
         * @return true if the student is removed
         */
		boolean remove(Student student) {return students.remove(student);}

		/**
		 * Gets the name of the building.
		 * @return the name of the building
         */
		public String getName(){return name;}
	}
        
        public static void main(String[] args){
            
            System.out.println("Hello World");
            
            Student s = new Student();
            
            s.email = "joe@aol.com";
            
            
            System.out.println(s.email);
            
            School z = new School("Oswego");
            
          
            
            System.out.println(z.getName());
            
            
        }
}
