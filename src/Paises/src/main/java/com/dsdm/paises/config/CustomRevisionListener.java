package com.dsdm.paises.config;

import com.dsdm.paises.entities.audit.Revision;

import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

	public void newRevision(Object revisionEntity) {
		final Revision revision = (Revision) revisionEntity;

	}
}

