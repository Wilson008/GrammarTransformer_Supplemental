/**
 * Copyright (c) 2016 Joel Greenyer and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * ScenarioTools-URL: www.scenariotools.org
 *    
 * Contributors:
 *     ScenarioTools Team - Initial API and implementation
 */
package org.scenariotools.sml.impl;

import org.eclipse.emf.ecore.EClass;

import org.scenariotools.sml.InterruptCondition;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InterruptConditionImpl extends ConditionFragmentImpl implements InterruptCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.INTERRUPT_CONDITION;
	}

} //InterruptConditionImpl
