package org.robobinding.codegen.presentationmodel;

import java.util.Comparator;

import org.robobinding.codegen.presentationmodel.EventMethodInfo;


/**
 * @since 1.0
 * @author Cheng Wei
 *
 */
public class EventMethodInfoComparator implements Comparator<EventMethodInfo> {
	@Override
	public int compare(EventMethodInfo o1, EventMethodInfo o2) {
		return o1.name().compareTo(o2.name());
	}
}
