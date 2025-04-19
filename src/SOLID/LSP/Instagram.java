package SOLID.LSP;

public class Instagram extends SocialMedia {

	@Override
	public void chatWithFriends() {

	}

	@Override
	public void publishpost(Object post) {

	}

	@Override
	public void sendPhotoVideo() {

	}

	@Override
	public void groupVideoCall(String... users) {
		// Instagram is not supported for this method
		// As per LSP derived class should be able to replace
		// base class 'SocialMedia'
		// 'Instagram' class not able to do that
		// LSP is being violated
	}

}
