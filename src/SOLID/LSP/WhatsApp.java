package SOLID.LSP;

public class WhatsApp extends SocialMedia {

	@Override
	public void chatWithFriends() {

	}

	@Override
	public void publishpost(Object post) {
		//WhatsApp is not supported for this method
		//As per LSP derived class should be able to replace 
		//base class 'SocialMedia'
		//'WhatsApp' class not able to do that
		// LSP is being violated
	}

	@Override
	public void sendPhotoVideo() {

	}

	@Override
	public void groupVideoCall(String... users) {

	}

}
