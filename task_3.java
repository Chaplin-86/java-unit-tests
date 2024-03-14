@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;  // Инициализируй поля класса в конструкторе
  }

 @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTestData() {
	return new Object[][] {
        //{0, false},
		{10, false},
        {18, true},
        {21, true},
        {68, true}, // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	// Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Должен возвращать false, если возраст меньше 21", result, isAdult);
	}
}
