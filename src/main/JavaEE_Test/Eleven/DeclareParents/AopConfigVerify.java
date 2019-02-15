package Eleven.DeclareParents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Aspect
@ComponentScan(basePackages = "Eleven")
@EnableAspectJAutoProxy
public class AopConfigVerify {

    @DeclareParents(value = "Eleven.RoleService+", defaultImpl = RoleVerifierImpl.class)
    public RoleVerifier roleVerifier;
}
