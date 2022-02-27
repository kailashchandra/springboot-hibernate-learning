package org.kdcoder.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
//Its singlton ,When application startup it will register that singlton class (service class) so no need to call every time.
	
	@Autowired
	private TopicRepository topicRepository;
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("Spring", "Spring framework", "Des1"),
//			new Topic("Java", "Core Java", "Des2"),
//			new Topic("Angular", "Angular 6", "Des3")
//		));
	
	public List<Topic> getAllTopics() {
//		return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics :: add);
		return topics;
	}
	
	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
//		topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
//		topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}
}
