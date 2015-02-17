package com.bluelinelabs.logansquare.processor;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.lang.String;

public final class EnumModel$$JsonObjectMapper {
    protected static final EnumModel.EnumTypeConverter ENUM_TYPE_CONVERTER = new EnumModel.EnumTypeConverter();

    public static void parseField(EnumModel instance, String fieldName, JsonParser jsonParser) throws IOException {
        if ("enum".equals(fieldName)) {
            instance.myEnum = ENUM_TYPE_CONVERTER.parse(jsonParser);
        }
    }

    public static void _serialize(EnumModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        if (writeStartAndEnd) {
            jsonGenerator.writeStartObject();
        }
        if (object.myEnum != null) {
            jsonGenerator.writeFieldName("enum");
            ENUM_TYPE_CONVERTER.serialize(object.myEnum, "enum", jsonGenerator);
        }
        if (writeStartAndEnd) {
            jsonGenerator.writeEndObject();
        }
    }
}
