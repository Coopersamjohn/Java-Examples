package example_inheritance1;

public class WhatsAppMain {

	public static void main(String[] args) {
		
		System.out.println("Accessing features using V3 object");
		
		WhatsAppV3 v3=new WhatsAppV3();
		
		v3.videoCalls();
		v3.textMessage();
		v3.videoStreaming();
		v3.voiceCalls();
		v3.voiceMessages();
		System.out.println(v3.getClass());
		System.out.println(v3.hashCode());
		
		WhatsAppV3 v33=new WhatsAppV3(); // when you do an object constructor like this, it references all previous constructors, starting with parent first, down to children.
		System.out.println(v33.hashCode());

	}

}
