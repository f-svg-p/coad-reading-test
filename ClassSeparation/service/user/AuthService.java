public class AuthService {
  // ログイン認証

  private final UserMapper userMapper;
  private final PasswordEncoder passwordEncoder;

  public AuthService(UserMapper userMapper, PasswordEncoder passwordEncoder) {
    this.userMapper = userMapper;
    this.passwordEncoder = passwordEncoder;
  }
  
  public User authenticate(LoginForm form) {
    User user = userMapper.findByEmail(form.getEmail());
    if (user == null) {
      throw new IllegalArgumentException("認証失敗");
    }

    if (!passwordEncoder.matches(form.getPassword(), user.getPassword())) {
      throw new IllegalArgumentException("認証失敗");
    }

    return user;
  }
}
