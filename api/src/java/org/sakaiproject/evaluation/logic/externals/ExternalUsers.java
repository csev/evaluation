/**
 * $Id: ExternalUsers.java 1000 Dec 24, 2006 12:07:31 AM azeckoski $
 * $URL: https://source.sakaiproject.org/contrib $
 * ExternalUsers.java - evaluation - Dec 24, 2006 12:07:31 AM - azeckoski
 **************************************************************************
 * Copyright (c) 2008 Centre for Applied Research in Educational Technologies, University of Cambridge
 * Licensed under the Educational Community License version 1.0
 * 
 * A copy of the Educational Community License has been included in this 
 * distribution and is available at: http://www.opensource.org/licenses/ecl1.php
 *
 * Aaron Zeckoski (azeckoski@gmail.com) (aaronz@vt.edu) (aaron@caret.cam.ac.uk)
 */

package org.sakaiproject.evaluation.logic.externals;

import java.util.Locale;

import org.sakaiproject.evaluation.logic.EvalExternalLogic;

/**
 * This interface provides methods to get user information into the evaluation system,
 * @see EvalExternalLogic
 * 
 * @author Aaron Zeckoski (aaronz@vt.edu)
 */
public interface ExternalUsers {

	/**
	 * Get the user id (not username) of the current user if there is one,
	 * if not then return an anonymous user id generated with a timestamp and prefix
	 * 
	 * @return the internal unique user id of the current user (not username) or anon id
	 */
	public String getCurrentUserId();

	/**
	 * Check if a user is anonymous or identified
	 * @param userId the internal user id (not username)
	 * @return true if we know who this user is, false otherwise
	 */
	public boolean isUserAnonymous(String userId);

	/**
	 * @param userId the internal user id (not username)
	 * @return the username or default text "------" if it cannot be found
	 */
	public String getUserUsername(String userId);
    
    /**
     * @param username the login name for the user
     * @return the internal user id (not username) or null if not found
     */
    public String getUserId(String username);

	/**
	 * Gets the displayable name for a user id<br/>
	 * <b>Warning</b>: This method is expensive so be careful when calling it
	 * 
	 * @param userId the internal user id (not username)
	 * @return the user display name or default text "--------" if it cannot be found
	 */
	public String getUserDisplayName(String userId);

	
	/**
	 * Get the locale for a user
	 * 
	 * @param userId the internal user id (not username)
	 * @return the Locale for this user based on their preferences
	 */
	public Locale getUserLocale(String userId);

}