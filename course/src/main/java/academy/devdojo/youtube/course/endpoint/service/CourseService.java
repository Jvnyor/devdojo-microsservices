package academy.devdojo.youtube.course.endpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import academy.devdojo.youtube.course.endpoint.model.Course;
import academy.devdojo.youtube.course.endpoint.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
	private final CourseRepository courseRepository;

	public Iterable<Course> list(Pageable pageable) {
		log.info("Listing all courses");
		return courseRepository.findAll(pageable);
	}
}