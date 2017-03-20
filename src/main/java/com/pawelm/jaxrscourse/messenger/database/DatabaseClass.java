package com.pawelm.jaxrscourse.messenger.database;

import com.pawelm.jaxrscourse.messenger.model.Message;
import com.pawelm.jaxrscourse.messenger.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PawelM on 2017-03-20.
 */
public class DatabaseClass {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<Long, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }
}
