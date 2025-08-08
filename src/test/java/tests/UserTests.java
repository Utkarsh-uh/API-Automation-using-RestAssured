package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import clients.UserClient;
import pojo.User;

public class UserTests extends BaseTest {

	UserClient userClient = new UserClient();

    @Test
    public void testGetUserWithPojo() {
        test = extent.createTest("Verify Get User API using POJO");

        User user = userClient.getUserObjectById(1);

        test.info("Verifying user ID...");
        Assert.assertEquals(user.getId(), 1);

        test.info("Verifying username...");
        Assert.assertEquals(user.getUsername(), "Bret");

        test.pass("All assertions passed.");
    }
}

