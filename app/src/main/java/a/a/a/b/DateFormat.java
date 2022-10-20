package a.a.a.b;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DateFormat {
    yyyy_MM_dd("yyyy-MM-dd"),
    yyyyMMddTHHmmssS("yyyyMMdd'T'HHmmssS"),
    yyyy_MM_dd__HH_mm_ss("yyyy-MM-dd' 'HH:mm:ss"),
    yyyy_MM_ddTHH_mm_ssZ("yyyy-MM-dd'T'HH:mm:ssZ"),
    yyyy_MM_ddTHH_mm_ssXXX("yyyy-MM-dd'T'HH:mm:ssXXX"),
    yyyyMMddHHmmssS("yyyyMMddHHmmssS"),
    yyyy_MM_dd_HH_mm_ss("yyyy_MM_dd_HH_mm_ss");

    private final String value;

}