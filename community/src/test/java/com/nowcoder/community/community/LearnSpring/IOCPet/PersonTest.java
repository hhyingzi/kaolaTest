package com.nowcoder.community.community.LearnSpring.IOCPet;

import com.nowcoder.community.community.CommunityApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class PersonTest {
    @Autowired
    Pet pet;
    @Test
    public void testIOC(){
        pet.say();
    }
}
