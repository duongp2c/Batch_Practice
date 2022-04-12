package com.example.demo_batch_alejandro.processor;

import com.example.demo_batch_alejandro.domain.Profile;
import com.example.demo_batch_alejandro.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class ProfileItemProcessor implements ItemProcessor<User, Profile> {
    private static final Logger log = LoggerFactory.getLogger(ProfileItemProcessor.class);

    @Override
    public Profile process(User user) throws Exception {

        log.info("processing user data.....{}", user);

        Profile transformedProfile = new Profile();
        transformedProfile.setUserId(user.getId());
        transformedProfile.setFullName(user.getFirstName() + " " + user.getLastName());
        return transformedProfile;
    }

}
