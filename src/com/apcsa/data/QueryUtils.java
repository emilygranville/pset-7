package com.apcsa.data;

public class QueryUtils {

    /////// QUERY CONSTANTS ///////////////////////////////////////////////////////////////
    
    /*
     * Determines if the default tables were correctly loaded.
     */
	
    public static final String SETUP_SQL =
        "SELECT COUNT(name) AS names FROM sqlite_master " +
            "WHERE type = 'table' " +
        "AND name NOT LIKE 'sqlite_%'";
    
    /*
     * Updates the last login timestamp each time a user logs into the system.
     */

    public static final String LOGIN_SQL =
        "SELECT * FROM users " +
            "WHERE username = ?" +
        "AND auth = ?";
    
    /*
     * Updates the last login timestamp each time a user logs into the system.
     */

    public static final String UPDATE_LAST_LOGIN_SQL =
        "UPDATE users " +
            "SET last_login = ? " +
        "WHERE username = ?";
    
    /*
     * Retrieves an administrator associated with a user account.
     */

    public static final String GET_ADMIN_SQL =
        "SELECT * FROM administrators " +
            "WHERE user_id = ?";
    
    /*
     * Retrieves a teacher associated with a user account.
     */

    public static final String GET_TEACHER_SQL =
        "SELECT * FROM teachers " +
            "WHERE user_id = ?";
    
    /*
     * Retrieves a student associated with a user account.
     */

    public static final String GET_STUDENT_SQL =
        "SELECT * FROM students " +
            "WHERE user_id = ?";
    
    /*
     * Updates password
     */
    
    public static final String UPDATE_PASSWORD_SQL =
            "UPDATE users " +
                "SET auth = ? " +
            "WHERE username = ?";
    
    public static final String GET_COURSES_FOR_TEACHER = 
    		"SELECT * FROM COURSES " +
    			"WHERE TEACHER_ID = ?";
    
    public static final String GET_COURSE_ID = 
    		"SELECT * FROM COURSES " +
    			"WHERE COURSE_NO = ?";
    
    public static final String GET_STUDENT_ID_BY_COURSE =
    		"SELECT * FROM course_grades " + 
    			"WHERE course_id = ?";
    
    public static final String GRADE_BY_COURSE = 
    		"SELECT * FROM COURSE_GRADES " +
    			"WHERE COURSE_ID = ? " +
    			"AND STUDENT_ID = ?";
}