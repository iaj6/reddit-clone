package ch.lukasmartinelli.redditclone.bl.reddit;

import java.util.Date;

import ch.lukasmartinelli.redditclone.bl.User;


public class DownVote extends Vote {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DownVote(Date clickTime, User user) {
		super(clickTime, user);
	}
	public DownVote(User u) {
		super(u);
		// TODO Auto-generated constructor stub
	}

}
