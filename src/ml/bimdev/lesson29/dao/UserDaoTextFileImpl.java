package ml.bimdev.lesson29.dao;

import ml.bimdev.lesson29.models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDaoTextFileImpl implements UserDao {
    private String filename;

    public UserDaoTextFileImpl() {
        filename = "assets/lesson29/user_data.txt";
    }

    @Override
    public void save(User model) {

    }

    @Override
    public User find(Long id) {
        try {
            Scanner sc = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("FIle not found: " + filename);
        }
        return null;
    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Long id) {

    }
}
