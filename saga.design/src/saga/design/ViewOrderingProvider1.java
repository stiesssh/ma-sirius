package saga.design;

import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.ui.tools.api.layout.ordering.ViewOrdering;
import org.eclipse.sirius.diagram.ui.tools.api.layout.ordering.ViewOrderingProvider;

public class ViewOrderingProvider1 implements ViewOrderingProvider {

	public ViewOrderingProvider1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean provides(DiagramElementMapping mapping) {
		return true;
	}

	@Override
	public ViewOrdering getViewOrdering(DiagramElementMapping mapping) {
//		if (mapping instanceof AbstractNodeMapping) {
//			System.out.println("provider : " + ((AbstractNodeMapping) mapping).getDomainClass());
//		}
			
		return new ViewOrdering1();
	}
}
