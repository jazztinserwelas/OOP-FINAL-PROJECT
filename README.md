# I. Brief Project Overview  
*StepUp: Unlocking Local Potential and Opportunities* is a job-matching platform designed to connect unskilled or low-income workers with local job opportunities while providing access to skill development resources. The platform aims to enhance employability and create meaningful opportunities for individuals in underserved communities. By integrating job listings, skill training, and automated user matching, *StepUp* bridges the gap between job seekers and employers, fostering inclusive economic growth and empowerment.

---

# II. Explanation of How OOP Principles Were Applied  

*Encapsulation*  
- *Encapsulation* is used in StepUp by combining related data and methods into a single unit while restricting direct access to private fields. For instance, the User class encapsulates attributes such as name, email, and role, which can only be accessed or modified via public getter and setter methods like getName() and setEmail(). Similarly, the Job class encapsulates job details such as title, location, and requirements. These fields are protected to maintain data integrity and prevent unauthorized access.

*Polymorphism*  
- *Polymorphism* is demonstrated through method overriding and overloading. The displayRole() method in the User class is overridden by its subclasses Admin and Worker. For example, Admin displays "Role: Administrator" with additional features like managing job postings, while Worker displays "Role: Job Seeker" with access to job recommendations. Method overloading is used in the applyJob() method, enabling users to apply either to a single job or multiple jobs based on their preferences.

*Inheritance*  
- *Inheritance* is implemented through a parent User class, from which the Admin and Worker subclasses inherit. Shared attributes such as username, password, and methods like login() are defined in the parent class. The Admin subclass extends these functionalities to include tasks like viewing all users, while the Worker subclass focuses on job searching and application. This approach reduces redundancy and promotes reusability of code.

*Abstraction*  
- *Abstraction* is achieved by defining abstract classes and methods that hide implementation details while exposing essential functionalities. The User class defines abstract methods like viewDashboard(), which are implemented differently in Admin and Worker. The JobManager class abstracts job-related operations such as adding, editing, and deleting job postings, while providing a simplified interface for admins to manage job listings effectively.

---

# III. SDG and Its Integration into the Project  

### *⦁ No Poverty*  
StepUp directly supports *SDG 1: No Poverty* by providing job-matching services for unskilled workers, enabling them to find stable income opportunities. By connecting them with local employers, the platform empowers individuals to lift themselves out of poverty and improve their standard of living.

### *⦁ Quality Education*  
StepUp promotes *SDG 4: Quality Education* by offering access to skill development resources such as online courses and workshops. These resources help workers enhance their qualifications, increasing their employability and fostering lifelong learning.

### *⦁ Decent Work and Economic Growth*  
Aligned with *SDG 8*, StepUp ensures access to decent work opportunities for all, promoting sustained and inclusive economic growth. By bridging the gap between job seekers and employers, the platform contributes to reducing unemployment and underemployment.

### *⦁ Reduced Inequalities*  
StepUp addresses *SDG 10* by creating an inclusive platform where individuals from diverse socio-economic backgrounds can access job opportunities and skill training. The platform prioritizes underserved communities, ensuring equal access to employment resources.

### *⦁ Partnerships for the Goals*  
StepUp fosters partnerships with local businesses, training providers, and government agencies, aligning with *SDG 17*. By collaborating with stakeholders, the platform amplifies its impact and ensures the sustainability of its initiatives.

---

# IV. Instructions for Running the Program  

### *Step 1: Install Development Tools*  
- Install Java JDK: Download the JDK from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://openjdk.org/).  
- Set up an IDE: Use an IDE such as IntelliJ IDEA, Eclipse, or VSCode for coding and debugging.  

### *Step 2: Create Project Files*  
1. Open your IDE and create a new project named StepUp.  
2. Create Java files for each class, e.g., User.java, Admin.java, Worker.java, Job.java, etc.  
3. Copy the provided code structure into the respective files.  

### *Step 3: Compile and Run the Program*  
- Compile the project using your IDE or the command line:  
  
javac *.java
java Main

### *Step 4: User Sign Up/Login*  
- New users can register as either an Admin or a Worker by providing details such as name, email, and password.  
- Existing users can log in using their credentials.  

### *Step 5: Explore Features*  
- *For Admins*:  
  - Add or manage job postings.  
  - View all registered workers and their activity.  

- *For Workers*:  
  - Browse and apply for jobs.  
  - Access skill training resources.  

### *Step 6: Apply for Jobs*  
- Select jobs from the available list and submit applications.  
- View the status of your applications on the dashboard.  

### *Step 7: Exit the Program*  
- Logout and terminate the program using the Exit option on the dashboard.
