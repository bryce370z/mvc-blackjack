
import mvc.AbstractController;
import mvc.JFrameView;

public class BlackJackController extends AbstractController  {

  public BlackJackController() {
    setModel(new BlackJackModel());
    setView(new BlackJackView((BlackJackModel)getModel(), this));
    ((JFrameView)getView()).setVisible(true);
  }

  // TODO: Implement black jack logic ...
}
