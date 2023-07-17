package com.coforge.jobs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.jobs.binding.AppliedJobs;
import com.coforge.jobs.entities.JobApplication;
import com.coforge.jobs.entities.User;
import com.coforge.jobs.repository.JobRepository;
import com.coforge.jobs.repository.UserRepository;


@Service
public class JobApplicationServiceImpl implements JobApplicationService{
	@Autowired
	JobRepository jobRepository;
	
	@Autowired
	UserRepository userRepository;


	@Override
	public User saveJobApplication(User user) {
		
		User savedUser = userRepository.save(user);
		
		return savedUser;
	}


	@Override
	public List<AppliedJobs> getAppliedJobs(Long userId) {
		User userApplications=userRepository.getById(userId);
		AppliedJobs appliedJob=new AppliedJobs();
		List<AppliedJobs> appliedJobs=new ArrayList<>();
		List<JobApplication> jobApplications = userApplications.getJobApplications();
		appliedJob.setUserId(userId);
		for(JobApplication jobApplication:jobApplications)
		{
			appliedJob.setJobId(jobApplication.getId());
			appliedJob.setJobTitle(jobApplication.getTitle());
			appliedJobs.add(appliedJob);
			
		}
		return appliedJobs;
	}

	@Override
	public boolean updateJobsApplication(User user) {
		boolean status=false;
		try {
		userRepository.save(user);
		status=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean deleteJobApplication(Long jobId) {
		boolean status=false;
		try {
		jobRepository.deleteById(jobId);
		status=true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> findAll = userRepository.findAll();
		return findAll;
	}


}
