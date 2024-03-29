package uni.apps.responsetesting.interfaces.listener;

/**
 * This interface deals with the events triggered by the instruction fragment
 * 
 * 
 * @author Mathew Andela
 *
 */
public interface EventInstructionsListener {

	public void switchFragments();
	public void goBack();
	public void onNextClick(String total, String light, String sound, String hr);
}
