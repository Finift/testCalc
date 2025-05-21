package org.example;


import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.example") //прогонятся все тесты из пакета(папки)
//@IncludeTags("param") //- тогда прихватим только тегированные
//@ExcludeTags("param") //наоборот, все, кроме параметризированного
public class TestSuite {
}
