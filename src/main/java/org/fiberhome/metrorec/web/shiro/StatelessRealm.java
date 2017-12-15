package org.fiberhome.metrorec.web.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
//import org.fiberhome.common.util.LoginUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class StatelessRealm extends AuthorizingRealm
{
    @Autowired
//    private PlatUserTokenService    platUserTokenService;
    
    @Override
    public boolean supports(AuthenticationToken token)
    {
        return token instanceof StatelessToken; 
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals)
    {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token)
        throws AuthenticationException
    {
        StatelessToken statelessToken = (StatelessToken)token;
        String userToken =  statelessToken.getToken();
//        int comeFrom= LoginUtil.getSourceType();
        boolean flag = false;
//        PlatUserToken ct = platUserTokenService.queryByCustom(statelessToken.getCustomId(),comeFrom);
//        if(ct != null && ct.getUserToken().equals(userToken.replaceAll(" ", "+"))){
//            flag = true;
//        }
        if(flag){
            SimpleAuthenticationInfo authcInfo = new SimpleAuthenticationInfo(statelessToken.getCustomId(), 
                    userToken,userToken);
            return authcInfo;
        }
        throw new AuthenticationException("请先登录");
    }

}
