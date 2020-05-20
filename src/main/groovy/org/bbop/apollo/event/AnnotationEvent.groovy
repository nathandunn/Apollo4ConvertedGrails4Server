package org.bbop.apollo.event

import org.bbop.apollo.Sequence
import org.grails.web.json.JSONObject

/**
 * Created by ndunn on 10/29/14.
 */
class AnnotationEvent {

    JSONObject features
    Sequence sequence
    Operation operation
    boolean sequenceAlterationEvent
    String username
    // toplevel feature?

//    public AnnotationEvent(Object features,Sequence sequence,Operation operation){
////        super(features)
//        this.sequence = sequence
//        this.operation = operation
//    }

    public enum Operation {
        ADD,
        DELETE,
        UPDATE,
        ERROR
    }

}
