package io.kdcoder.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
//Its singlton ,When application startup it will register that singlton class (service class) so no need to call every time.
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(11, "Spring framework", "Des1"),
			new Topic(12, "Core Java", "Des2"),
			new Topic(13, "Angular 6", "Des3")
		));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(int id) {
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(int id, Topic topic) {
		// TODO Auto-generated method stub
		for(int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId() == id) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(int id) {
		// TODO Auto-generated method stub
		topics.removeIf(t -> t.getId() == id);
	}
}
