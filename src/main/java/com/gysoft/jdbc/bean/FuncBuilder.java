package com.gysoft.jdbc.bean;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author 周宁
 */
public class FuncBuilder {

    public static FuncBuilderExt lengthAs(String field) {
        return new FuncBuilderExt(length(field));
    }

    public static <T, R> FuncBuilderExt lengthAs(TypeFunction<T, R> function) {
        return lengthAs(TypeFunction.getLambdaColumnName(function));
    }


    public static <T, R> String length(TypeFunction<T, R> function) {
        return length(TypeFunction.getLambdaColumnName(function));
    }

    public static String length(String field) {
        return "LENGTH(" + field + ")";
    }

    public static String charLength(String field) {
        return "CHAR_LENGTH(" + field + ")";
    }

    public static <T, R> String charLength(TypeFunction<T, R> function) {
        return charLength(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt charLengthAs(String field) {
        return new FuncBuilderExt(charLength(field));
    }

    public static <T, R> FuncBuilderExt charLengthAs(TypeFunction<T, R> field) {
        return charLengthAs(TypeFunction.getLambdaColumnName(field));
    }

    public static FuncBuilderExt avgAs(String field) {
        return new FuncBuilderExt(avg(field));
    }

    public static <T, R> FuncBuilderExt avgAs(TypeFunction<T, R> function) {
        return avgAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String avg(String field) {
        return "AVG(" + field + ")";
    }

    public static <T, R> String avg(TypeFunction<T, R> function) {
        return avg(TypeFunction.getLambdaColumnName(function));
    }

    public static <T, R> FuncBuilderExt countAs(TypeFunction<T, R> function) {
        return countAs(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt countAs(String field) {
        return new FuncBuilderExt(count(field));
    }

    public static String count(String field) {
        return "COUNT(" + field + ")";
    }

    public static <T, R> String count(TypeFunction<T, R> function) {
        return count(TypeFunction.getLambdaColumnName(function));
    }


    public static FuncBuilderExt maxAs(String field) {
        return new FuncBuilderExt(max(field));
    }

    public static <T, R> FuncBuilderExt maxAs(TypeFunction<T, R> function) {
        return maxAs(TypeFunction.getLambdaColumnName(function));
    }


    public static String max(String field) {
        return "MAX(" + field + ")";
    }

    public static <T, R> String max(TypeFunction<T, R> function) {
        return max(TypeFunction.getLambdaColumnName(function));
    }


    public static FuncBuilderExt minAs(String field) {
        return new FuncBuilderExt(min(field));
    }

    public static <T, R> FuncBuilderExt minAs(TypeFunction<T, R> function) {
        return minAs(TypeFunction.getLambdaColumnName(function));
    }

    public static <T, R> String min(TypeFunction<T, R> function) {
        return min(TypeFunction.getLambdaColumnName(function));
    }

    public static String min(String field) {
        return "MIN(" + field + ")";
    }

    public static FuncBuilderExt sumAs(String field) {
        return new FuncBuilderExt(sum(field));
    }

    public static <T, R> FuncBuilderExt sumAs(TypeFunction<T, R> function) {
        return sumAs(TypeFunction.getLambdaColumnName(function));
    }

    public static <T, R> String sum(TypeFunction<T, R> function) {
        return sum(TypeFunction.getLambdaColumnName(function));
    }


    public static String sum(String field) {
        return "SUM(" + field + ")";
    }

    public static String concat(String... fields) {
        return "CONCAT(" + Arrays.stream(fields).collect(Collectors.joining(",")) + ")";
    }

    public static <T, R> String concat(TypeFunction<T, R>... functions) {
        return concat(Arrays.stream(functions).map(function -> TypeFunction.getLambdaColumnName(function)).collect(Collectors.toList()).toArray(new String[0]));
    }

    public static FuncBuilderExt concatAs(String... fields) {
        return new FuncBuilderExt(concat(fields));
    }

    public static <T, R> FuncBuilderExt concatAs(TypeFunction<T, R>... functions) {
        return concatAs(Arrays.stream(functions).map(function -> TypeFunction.getLambdaColumnName(function)).collect(Collectors.toList()).toArray(new String[0]));
    }

    public static FuncBuilderExt concat_wsAs(String joinStr, String... fields) {
        return new FuncBuilderExt(concat_ws(joinStr, fields));
    }

    public static <T, R> FuncBuilderExt concat_wsAs(String joinStr, TypeFunction<T, R>... functions) {
        return concat_wsAs(joinStr, Arrays.stream(functions).map(function -> TypeFunction.getLambdaColumnName(function)).collect(Collectors.toList()).toArray(new String[0]));
    }

    public static String concat_ws(String joinStr, String... fields) {
        return "CONCAT_WS(" + joinStr + "," + Arrays.stream(fields).collect(Collectors.joining(",")) + ")";
    }

    public static <T, R> String concat_ws(String joinStr, TypeFunction<T, R>... functions) {
        return concat_ws(joinStr, Arrays.stream(functions).map(function -> TypeFunction.getLambdaColumnName(function)).collect(Collectors.toList()).toArray(new String[0]));
    }


    public static FuncBuilderExt upperAs(String field) {
        return new FuncBuilderExt(upper(field));
    }

    public static <T,R>FuncBuilderExt upperAs(TypeFunction<T,R> function) {
        return upperAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String upper(String field) {
        return "UPPER(" + field + ")";
    }

    public static <T,R>String upper(TypeFunction<T,R> field) {
        return upper(TypeFunction.getLambdaColumnName(field));
    }

    public static FuncBuilderExt lowerAs(String field) {
        return new FuncBuilderExt(lower(field));
    }

    public static <T,R>FuncBuilderExt lowerAs(TypeFunction<T,R> function) {
        return lowerAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String lower(String field) {
        return "LOWER(" + field + ")";
    }

    public static <T,R>String lower(TypeFunction<T,R> function) {
        return lower(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt findInSetAs(String field, String field2) {
        return new FuncBuilderExt(findInSet(field, field2));
    }

    public static String findInSet(String field, String field2) {
        return "FIND_IN_SET(" + field + "," + field2 + ")";
    }

    public static FuncBuilderExt locateAs(String field, String field2) {
        return new FuncBuilderExt(locate(field, field2));
    }

    public static String locate(String field, String field2) {
        return "LOCATE(" + field + "," + field2 + ")";
    }

    public static FuncBuilderExt positionAs(String field, String field2) {
        return new FuncBuilderExt(position(field, field2));
    }

    public static String position(String field, String field2) {
        return "POSITION(" + field + " IN " + field2 + ")";
    }

    public static FuncBuilderExt instrAs(String field, String field2) {
        return new FuncBuilderExt(instr(field, field2));
    }

    public static String instr(String field, String field2) {
        return "INSTR(" + field + "," + field2 + ")";
    }

    public static FuncBuilderExt leftAs(String field, int index) {
        return new FuncBuilderExt(left(field, index));
    }

    public static String left(String field, int index) {
        return "LEFT(" + field + "," + index + ")";
    }

    public static FuncBuilderExt eltAs(int index, String... fields) {
        return new FuncBuilderExt(elt(index, fields));
    }

    public static String elt(int index, String... fields) {
        return "ELT(" + index + "," + Arrays.stream(fields).collect(Collectors.joining(",")) + ")";
    }

    public static FuncBuilderExt rightAs(String field, int index) {
        return new FuncBuilderExt(right(field, index));
    }

    public static String right(String field, int index) {
        return "RIGHT(" + field + "," + index + ")";
    }

    public static FuncBuilderExt substringAs(String field, int index, int index2) {
        return new FuncBuilderExt(substring(field, index, index2));
    }

    public static String substring(String field, int index, int index2) {
        return "SUBSTRING(" + field + "," + index + "," + index2 + ")";
    }

    public static FuncBuilderExt ltrimAs(String field) {
        return new FuncBuilderExt(ltrim(field));
    }

    public static <T, R> FuncBuilderExt ltrimAs(TypeFunction<T, R> function) {
        return ltrimAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String ltrim(String field) {
        return "LTRIM(" + field + ")";
    }

    public static <T, R> String ltrim(TypeFunction<T, R> function) {
        return ltrim(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt rtrimAs(String field) {
        return new FuncBuilderExt(rtrim(field));
    }

    public static <T, R> FuncBuilderExt rtrimAs(TypeFunction<T, R> function) {
        return rtrimAs(TypeFunction.getLambdaColumnName(function));
    }


    public static String rtrim(String field) {
        return "RTRIM(" + field + ")";
    }

    public static <T, R> String rtrim(TypeFunction<T, R> function) {
        return rtrim(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt trimAs(String field) {
        return new FuncBuilderExt(trim(field));
    }

    public static <T, R> FuncBuilderExt trimAs(TypeFunction<T, R> function) {
        return trimAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String trim(String field) {
        return "TRIM(" + field + ")";
    }

    public static <T, R> String trim(TypeFunction<T, R> function) {
        return trim(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt insertAs(String field, int start, int end, String field2) {
        return new FuncBuilderExt(insert(field, start, end, field2));
    }

    public static String insert(String field, int start, int end, String field2) {
        return new StringBuilder().append("INSERT(").append(field).append(",").append(start)
                .append(",").append(end).append(",").append(field2).append(")").toString();
    }

    public static FuncBuilderExt replaceAs(String field, String field2, String field3) {
        return new FuncBuilderExt(replace(field, field2, field3));
    }

    public static String replace(String field, String field2, String field3) {
        return new StringBuilder().append("REPLACE(").append(field).append(",")
                .append(field2).append(",").append(field3).append(")").toString();
    }

    public static FuncBuilderExt absAs(String field) {
        return new FuncBuilderExt(abs(field));
    }

    public static <T, R> FuncBuilderExt absAs(TypeFunction<T, R> function) {
        return absAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String abs(String field) {
        return "ABS(" + field + ")";
    }

    public static <T, R> String abs(TypeFunction<T, R> function) {
        return abs(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt ceilAs(String field) {
        return new FuncBuilderExt(ceil(field));
    }

    public static <T, R> FuncBuilderExt ceilAs(TypeFunction<T, R> function) {
        return ceilAs(TypeFunction.getLambdaColumnName(function));
    }


    public static String ceil(String field) {
        return "CEIL(" + field + ")";
    }

    public static <T, R> String ceil(TypeFunction<T, R> function) {
        return ceil(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt floorAs(String field) {
        return new FuncBuilderExt(floor(field));
    }

    public static <T, R> FuncBuilderExt floorAs(TypeFunction<T, R> function) {
        return floorAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String floor(String field) {
        return "FLOOR(" + field + ")";
    }

    public static <T, R> String floor(TypeFunction<T, R> function) {
        return floor(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt modAs(String field, String field2) {
        return new FuncBuilderExt(mod(field, field2));
    }

    public static String mod(String field, String field2) {
        return new StringBuilder().append("MOD(").append(field)
                .append(",").append(field2).append(")").toString();
    }

    public static FuncBuilderExt randAs() {
        return new FuncBuilderExt(rand());
    }

    public static FuncBuilderExt randAs(int seed) {
        return new FuncBuilderExt(rand(seed));
    }

    public static String rand() {
        return "RAND()";
    }

    public static String rand(int seed) {
        return "RAND(" + seed + ")";
    }

    public static FuncBuilderExt roundAs(String field, int digit) {
        return new FuncBuilderExt(round(field, digit));
    }

    public static String round(String field, int digit) {
        return new StringBuilder().append("ROUND(").append(field).append(",")
                .append(digit).append(")").toString();
    }

    public static FuncBuilderExt truncateAs(String field, int digit) {
        return new FuncBuilderExt(truncate(field, digit));
    }

    public static String truncate(String field, int digit) {
        return new StringBuilder().append("TRUNCATE(").append(field).append(",")
                .append(digit).append(")").toString();
    }

    public static FuncBuilderExt curdateAs() {
        return new FuncBuilderExt(curdate());
    }

    public static String curdate() {
        return "CURDATE()";
    }

    public static FuncBuilderExt curtimeAs() {
        return new FuncBuilderExt(curtime());
    }

    public static String curtime() {
        return "CURTIME()";
    }

    public static FuncBuilderExt nowAs() {
        return new FuncBuilderExt(now());
    }

    public static String now() {
        return "NOW()";
    }

    public static FuncBuilderExt monthAs(String dateField) {
        return new FuncBuilderExt(month(dateField));
    }

    public static String month(String dateField) {
        return "MONTH(" + dateField + ")";
    }

    public static FuncBuilderExt monthnameAs(String dateField) {
        return new FuncBuilderExt(monthname(dateField));
    }

    public static String monthname(String dateField) {
        return "MONTHNAME(" + dateField + ")";
    }

    public static FuncBuilderExt weekAs(String dateField) {
        return new FuncBuilderExt(week(dateField));
    }

    public static String week(String dateField) {
        return "WEEK(" + dateField + ")";
    }

    public static FuncBuilderExt yearAs(String dateField) {
        return new FuncBuilderExt(year(dateField));
    }

    public static String year(String dateField) {
        return "YEAR(" + dateField + ")";
    }

    public static FuncBuilderExt hourAs(String timeField) {
        return new FuncBuilderExt(hour(timeField));
    }

    public static String hour(String timeField) {
        return "HOUR(" + timeField + ")";
    }

    public static FuncBuilderExt minuteAs(String timeField) {
        return new FuncBuilderExt(minute(timeField));
    }

    public static String minute(String timeField) {
        return "MINUTE(" + timeField + ")";
    }

    public static FuncBuilderExt weekdayAs(String dateField) {
        return new FuncBuilderExt(weekday(dateField));
    }

    public static String weekday(String dateField) {
        return "WEEKDAY(" + dateField + ")";
    }

    public static FuncBuilderExt daynameAs(String dateField) {
        return new FuncBuilderExt(dayname(dateField));
    }

    public static String dayname(String dateField) {
        return "DAYNAME(" + dateField + ")";
    }

    public static FuncBuilderExt distinctAs(String field) {
        return new FuncBuilderExt(distinct(field));
    }

    public static String distinct(String field) {
        return "DISTINCT(" + field + ")";
    }

    public static <T, R> FuncBuilderExt distinctAs(TypeFunction<T, R> function) {
        return distinctAs(TypeFunction.getLambdaColumnName(function));
    }

    public static <T, R> String distinct(TypeFunction<T, R> function) {
        return distinct(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt convertUsingGbkAs(String field) {
        return new FuncBuilderExt(convertUsingGbk(field));
    }

    public static <T,R>FuncBuilderExt convertUsingGbkAs(TypeFunction<T,R> function) {
        return convertUsingGbkAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String convertUsingGbk(String field) {
        return "CONVERT("+field+" USING GBK)";
    }

    public static <T,R>String convertUsingGbk(TypeFunction<T,R> function) {
        return convertUsingGbk(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt dateFormatAs(String field, String formatPattern) {
        return new FuncBuilderExt(dateFormat(field, formatPattern));
    }

    public static <T, R> FuncBuilderExt dateFormatAs(TypeFunction<T, R> function, String formatPattern) {
        return dateFormatAs(TypeFunction.getLambdaColumnName(function), formatPattern);
    }

    public static String dateFormat(String field, String formatPattern) {
        return new StringBuilder().append("DATE_FORMAT(").append(field)
                .append(",'").append(formatPattern).append("')").toString();
    }

    public static <T, R> String dateFormat(TypeFunction<T, R> function, String formatPattern) {
        return dateFormat(TypeFunction.getLambdaColumnName(function), formatPattern);
    }

    public static FuncBuilderExt formatAs(String field, String formatPattern) {
        return new FuncBuilderExt(format(field, formatPattern));
    }

    public static <T, R> FuncBuilderExt formatAs(TypeFunction<T, R> function, String formatPattern) {
        return formatAs(TypeFunction.getLambdaColumnName(function), formatPattern);
    }

    public static String format(String field, String formatPattern) {
        return new StringBuilder().append("FORMAT(").append(field)
                .append(",'").append(formatPattern).append("')").toString();
    }

    public static <T, R> String format(TypeFunction<T, R> function, String formatPattern) {
        return format(TypeFunction.getLambdaColumnName(function), formatPattern);
    }

    public static FuncBuilderExt dateSubAs(String field, String express) {
        return new FuncBuilderExt(dateSub(field, express));
    }

    public static <T, R> FuncBuilderExt dateSubAs(TypeFunction<T, R> function, String express) {
        return dateSubAs(TypeFunction.getLambdaColumnName(function), express);
    }

    public static String dateSub(String field, String express) {
        return new StringBuilder().append("DATE_SUB(").append(field).append(",")
                .append(express).append(")").toString();
    }

    public static <T, R> String dateSub(TypeFunction<T, R> function, String express) {
        return dateSub(TypeFunction.getLambdaColumnName(function), express);
    }

    public static FuncBuilderExt dateAddAs(String field, String express) {
        return new FuncBuilderExt(dateAdd(field, express));
    }

    public static <T, R> FuncBuilderExt dateAddAs(TypeFunction<T, R> function, String express) {
        return dateAddAs(TypeFunction.getLambdaColumnName(function), express);
    }

    public static String dateAdd(String field, String express) {
        return new StringBuilder().append("DATE_ADD(").append(field)
                .append(",").append(express).append(")").toString();
    }

    public static <T, R> String dateAdd(TypeFunction<T, R> function, String express) {
        return dateAdd(TypeFunction.getLambdaColumnName(function), express);
    }

    public static FuncBuilderExt strToDateAs(String field, String formatPattern) {
        return new FuncBuilderExt(strToDate(field, formatPattern));
    }

    public static <T, R> FuncBuilderExt strToDateAs(TypeFunction<T, R> function, String formatPattern) {
        return strToDateAs(TypeFunction.getLambdaColumnName(function), formatPattern);
    }

    public static String strToDate(String field, String formatPattern) {
        return new StringBuilder().append("STR_TO_DATE(").append(field).append(",'")
                .append(formatPattern).append("')").toString();
    }

    public static <T, R> String strToDate(TypeFunction<T, R> function, String formatPattern) {
        return strToDate(TypeFunction.getLambdaColumnName(function), formatPattern);
    }

    public static FuncBuilderExt ifNullAs(String field, Object val) {
        return new FuncBuilderExt(ifNull(field, val));
    }

    public static <T, R> FuncBuilderExt ifNullAs(TypeFunction<T, R> function, Object val) {
        return ifNullAs(TypeFunction.getLambdaColumnName(function), val);
    }

    public static String ifNull(String field, Object val) {
        return new StringBuilder().append("IFNULL(").append(field)
                .append(",").append(val).append(")").toString();
    }

    public static <T, R> String ifNull(TypeFunction<T, R> function, Object val) {
        return ifNull(TypeFunction.getLambdaColumnName(function), val);
    }

    public static FuncBuilderExt ifAs(String express, Object val1, Object val2) {
        return new FuncBuilderExt(_if(express, val1, val2));
    }

    public static <T, R> FuncBuilderExt ifAs(TypeFunction<T, R> function, Object val1, Object val2) {
        return ifAs(TypeFunction.getLambdaColumnName(function), val1, val2);
    }

    public static String _if(String express, Object val1, Object val2) {
        return new StringBuilder().append("IF(").append(express).append(",")
                .append(val1).append(",").append(val2).append(")").toString();
    }

    public static <T, R> String _if(TypeFunction<T, R> function, Object val1, Object val2) {
        return _if(TypeFunction.getLambdaColumnName(function), val1, val2);
    }

    public static FuncBuilderExt unixTimeStampAs(String field) {
        return new FuncBuilderExt(unixTimeStamp(field));
    }

    public static <T, R> FuncBuilderExt unixTimeStampAs(TypeFunction<T, R> function) {
        return unixTimeStampAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String unixTimeStamp(String field) {
        return "UNIX_TIMESTAMP(" + field + ")";
    }

    public static <T, R> String unixTimeStamp(TypeFunction<T, R> function) {
        return unixTimeStamp(TypeFunction.getLambdaColumnName(function));
    }

    public static FuncBuilderExt fromUnixTimeAs(String field, String formatPattern) {
        return new FuncBuilderExt(fromUnixTime(field, formatPattern));
    }

    public static <T, R> FuncBuilderExt fromUnixTimeAs(TypeFunction<T, R> function, String formatPattern) {
        return fromUnixTimeAs(TypeFunction.getLambdaColumnName(function), formatPattern);
    }

    public static String fromUnixTime(String field, String formatPattern) {
        return new StringBuilder().append("FROM_UNIXTIME(").append(field)
                .append(",'").append(formatPattern).append("')").toString();
    }

    public static <T, R> String fromUnixTime(TypeFunction<T, R> function, String formatPattern) {
        return fromUnixTime(TypeFunction.getLambdaColumnName(function), formatPattern);
    }

    public static FuncBuilderExt dateAs(String field) {
        return new FuncBuilderExt(date(field));
    }

    public static <T, R> FuncBuilderExt dateAs(TypeFunction<T, R> function) {
        return dateAs(TypeFunction.getLambdaColumnName(function));
    }

    public static String date(String field) {
        return "DATE(" + field + ")";
    }

    public static <T, R> String date(TypeFunction<T, R> function) {
        return date(TypeFunction.getLambdaColumnName(function));
    }

    private static class FuncBuilderExt {
        private String funcSql;
        protected FuncBuilderExt(String funcSql){
            this.funcSql = funcSql;
        }
        public String as(String as) {
            return funcSql + " AS " + as;
        }
    }

}
