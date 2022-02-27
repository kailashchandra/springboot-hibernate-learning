package org.kdcoder.topics.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
//Its singlton ,When application startup it will register that singlton class (service class) so no need to call every time.
	
	@Autowired
	private CourseRepository courseRepository;
//	private List<Course> topics = new ArrayList<>(Arrays.asList(
//			new Course("Spring", "Spring framework", "Des1"),
//			new Course("Java", "Core Java", "Des2"),
//			new Course("Angular", "Angular 6", "Des3")
//		));
	
	public List<Course> getAllCourses(String topicId) {
//		return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses :: add);
		return courses;
	}
	
	public Course getCourse(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		// TODO Auto-generated method stub
//		topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
//		topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}
}
