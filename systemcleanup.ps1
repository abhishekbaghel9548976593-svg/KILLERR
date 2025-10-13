<#
.SYNOPSIS
    PowerShell script to remove junk files, temp files, and perform system cleanup.

.DESCRIPTION
    This script will:
    - Delete user temp files
    - Delete Windows temp files
    - Clear Windows Update cache
    - Empty Recycle Bin
    - Run Disk Cleanup (Cleanmgr) silently
#>

# Run as Administrator check
If (-NOT ([Security.Principal.WindowsPrincipal] [Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole] "Administrator"))
{
    Write-Host "Please run this script as Administrator!" -ForegroundColor Red
    Break
}

Write-Host "=== Starting System Cleanup ===" -ForegroundColor Cyan

# Clear User Temp
Write-Host "Cleaning User Temp Files..."
Remove-Item "$env:TEMP\*" -Recurse -Force -ErrorAction SilentlyContinue

# Clear Windows Temp
Write-Host "Cleaning Windows Temp Files..."
Remove-Item "C:\Windows\Temp\*" -Recurse -Force -ErrorAction SilentlyContinue

# Clear Windows Update Cache
Write-Host "Stopping Windows Update Service..."
Stop-Service -Name wuauserv -Force -ErrorAction SilentlyContinue

Write-Host "Clearing Windows Update Cache..."
Remove-Item "C:\Windows\SoftwareDistribution\Download\*" -Recurse -Force -ErrorAction SilentlyContinue

Write-Host "Starting Windows Update Service..."
Start-Service -Name wuauserv -ErrorAction SilentlyContinue

# Empty Recycle Bin
Write-Host "Emptying Recycle Bin..."
Clear-RecycleBin -Force -ErrorAction SilentlyContinue

# Run Disk Cleanup silently
Write-Host "Running Disk Cleanup..."
Start-Process cleanmgr.exe -ArgumentList "/sagerun:1" -Wait -NoNewWindow

Write-Host "=== System Cleanup Completed Successfully ===" -ForegroundColor Green
