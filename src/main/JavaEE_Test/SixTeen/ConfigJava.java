package SixTeen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ConfigJava {
    @Autowired
    private FormattingConversionServiceFactoryBean formattingConversionServiceFactoryBean;
 /*  @Bean(name = "requestMappingHandlerAdapter")
    public RequestMappingHandlerAdapter getRequestMappingHandlerAdapter() {
       RequestMappingHandlerAdapter rma = new RequestMappingHandlerAdapter();

        MappingJackson2HttpMessageConverter jh = new MappingJackson2HttpMessageConverter();

        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.APPLICATION_JSON_UTF8);

        jh.setSupportedMediaTypes(mediaTypes);
        rma.getMessageConverters().add(jh);
        return rma;
    }*/

/* @Bean(name = "convert")
    public void init() {
        List<Converter> converters = new ArrayList<>();
        converters.add(new StringToRole());
        formattingConversionServiceFactoryBean.getObject().addConverter((Converter<?, ?>) converters);
    }*/


}
