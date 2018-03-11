@echo off
del /s /q "C:\Users\Abhay\eclipse-workspace\firstproject\WebContent\images\*.*"
for /d %%p in("C:\Users\Abhay\eclipse-workspace\firstproject\WebContent\images\*.*") do rmdir "%%p" /s /q
exit