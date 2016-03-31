loop do
  dp = Hash.new(0)
  dp[0] = 1
  m = gets.to_i
  break if m.zero?
  m.times do
    a, b = gets.split.map &:to_i
    1000.downto(0) do |i|
      next if dp[i].zero?
      (1..b).each do |j|
        k = i + a * j
        break if k >= 1000
        dp[k] += dp[i]
      end
    end
  end
  gets.to_i.times { puts dp[gets.to_i] }
end
