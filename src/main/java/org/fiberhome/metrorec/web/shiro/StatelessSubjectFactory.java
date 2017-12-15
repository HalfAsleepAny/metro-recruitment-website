package org.fiberhome.metrorec.web.shiro;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;

public class StatelessSubjectFactory extends DefaultWebSubjectFactory
{

    @Override
    public Subject createSubject(SubjectContext context)
    {
 //       context.setSessionCreationEnabled(false);
        return super.createSubject(context);
    }
}
