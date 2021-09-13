import datetime

weekDays = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
month, day = map(int, input().split())
weekDayIndex = datetime.date(2007, month, day).weekday()

print(weekDays[weekDayIndex])