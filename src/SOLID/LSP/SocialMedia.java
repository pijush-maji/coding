package SOLID.LSP;

public abstract class SocialMedia {

	public abstract void chatWithFriends();
	
	public abstract void publishpost(Object post);
	
	public abstract void sendPhotoVideo();
	
	public abstract void groupVideoCall(String... users);
}
